import java.util.ArrayList;
import java.util.UUID;

/* Students can perform various actions within the Hogwarts School Management System,
 including taking courses, viewing teachers, and participating in sorting quizzes.*/
public class Student {
    private ArrayList<Course> _courses = new ArrayList<>();
    private UUID _studentID;
    public String studentFullName;
    Student() {
        _studentID = UUID.randomUUID();
        studentFullName = _studentID.toString();
        System.out.println("student " + studentFullName + " constructed.");
    }
    public UUID get_studentID() {
        return _studentID;
    }
    public void set_studentID(UUID _studentID) {
        this._studentID = _studentID;
    }
    // Taking Courses: Enroll in courses by taking them.
    public void TakeCourse(Course pCourse) {
        System.out.println("Student.TakeCourse() called.");
        pCourse.Enroll(this);
        _courses.add(pCourse);

    }
    // Viewing All Courses Taken: View a list of all courses taken.
    public ArrayList<Course> get_courses() {
        return _courses;

    }
    // Viewing All Teachers: Access a list of all teachers taken courses with.
    public ArrayList<Teacher> get_teachers_taken_courses_with() {
        ArrayList<Teacher> _teachers = new ArrayList<>();
        for (Course c : _courses) {
            if (c.get_teacher()!=null)
                _teachers.add(c.get_teacher());
        }
        return _teachers;
    }

    // TODO: Taking a Sorting Quiz: Take a quiz to determine their Hogwarts House (Gryffindor, Hufflepuff, Ravenclaw, or Slytherin).
}