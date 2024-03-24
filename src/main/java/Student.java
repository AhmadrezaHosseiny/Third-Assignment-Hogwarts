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
        Hogwarts.students.add(this);
        System.out.println("student " + studentFullName + " constructed.");
    }
    Student(String pFullName) {
        _studentID = UUID.randomUUID();
        studentFullName = pFullName;
        Hogwarts.students.add(this);
        System.out.println("student " + studentFullName + " constructed.");
    }
    public UUID get_studentID() {
        return _studentID;
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
    public void show_teachers_taken_courses_with() {
        System.out.println("show_teachers_taken_courses_with called.");
        for (Teacher t : get_teachers_taken_courses_with()) {
            t.show();
        }
    }
    public static void show_teachers_taken_courses_with_for_all_students() {
        for (Student s : Hogwarts.students) {
            s.show_teachers_taken_courses_with();
        }
    }
    public void show( ) {
        show("\t\t");
    }
    public void show(String prefix) {
            System.out.println(prefix + "studentID: " + this.get_studentID().toString());
            System.out.println(prefix + "StudentFullName: " + this.studentFullName);
    }
    // TODO: Taking a Sorting Quiz: Take a quiz to determine their Hogwarts House (Gryffindor, Hufflepuff, Ravenclaw, or Slytherin).
}