import java.util.ArrayList;
import java.util.UUID;

/* Students can perform various actions within the Hogwarts School Management System,
 including taking courses, viewing teachers, and participating in sorting quizzes.*/
public class Student {
    private ArrayList<Course> _courses = new ArrayList<>();
    private UUID _studentID;
    public String studentFullName;
    Student(UUID pID, String pFullName) {
        Hogwarts.log("student constructor start");
        _studentID = pID;
        studentFullName = pFullName;
        Hogwarts.students.add(this);
        Hogwarts.log("student " + _studentID.toString() + " " + studentFullName + " constructed.");
    }
    public UUID get_studentID() {
        return _studentID;
    }
    public static Student create(String pFullName) {
        Hogwarts.log("create start");
        return new Student(UUID.randomUUID(), pFullName);
    }




    // Taking Courses: Enroll in courses by taking them.
    public void TakeCourse(Course pCourse) {
        Hogwarts.log("take course start");
        pCourse.Enroll(this);
        _courses.add(pCourse);
        Hogwarts.log("takecourse end");
    }




    // Viewing All Courses Taken: View a list of all courses taken.
    public ArrayList<Course> get_courses() {
        return _courses;
    }




    // Viewing All Teachers: Access a list of all teachers taken courses with.
    public ArrayList<Teacher> get_teachers_taken_courses_with() {
        Hogwarts.log("get_teachers_taken_courses_with start");
        ArrayList<Teacher> _teachers = new ArrayList<>();
        for (Course c : _courses) {
            if (c.get_teacher()!=null)
                _teachers.add(c.get_teacher());
        }
        Hogwarts.log("get_teachers_taken_courses_with end");
        return _teachers;
    }


    public void show_teachers_taken_courses_with() {
        Hogwarts.log("show_teachers_taken_courses_with start");
        for (Teacher t : get_teachers_taken_courses_with()) {
            t.show();
        }
        Hogwarts.log("show_teachers_taken_courses_with end");
    }

    public static void show_teachers_taken_courses_with_for_all_students() {
        Hogwarts.log("show_teachers_taken_courses_with_for_all_students start");
        for (Student s : Hogwarts.students) {
            s.show_teachers_taken_courses_with();
        }
        Hogwarts.log("show_teachers_taken_courses_with_for_all_students end");
    }

    public void show( ) {
        Hogwarts.log("show start");
        show("\t\t");
    }

    public void show(String prefix) {
        Hogwarts.log("show start");
        System.out.println(prefix + "studentID: " + this.get_studentID().toString());
        System.out.println(prefix + "StudentFullName: " + this.studentFullName);
    }
    //TODO: Taking a Sorting Quiz: Take a quiz to determine their Hogwarts House (Gryffindor, Hufflepuff, Ravenclaw, or Slytherin).
}