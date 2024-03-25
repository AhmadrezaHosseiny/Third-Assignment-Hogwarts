import java.util.ArrayList;
import java.util.UUID;

/* Teachers should be able to manage courses, score students,
 and access valuable information to enhance their teaching experience on the platform.*/
public class Teacher {
    private ArrayList<Course> _courses = new ArrayList<>();
    private UUID _teacherID;
    private String _FullName;
    Teacher(UUID pID, String pFullName) {
        Hogwarts.log("teacher constructor start");
        _teacherID = pID;
        _FullName = pFullName;
        Hogwarts.teachers.add(this);
        Hogwarts.log("teacher " + _teacherID.toString() + " " + _FullName + " constructed.");
    }
    public static Teacher create(String pFullName) {
        Hogwarts.log("create start");
        return new Teacher(UUID.randomUUID(), pFullName);
    }
    public String get_FullName() {
        Hogwarts.log("getfullname start");
        return _FullName;
    }
    public UUID get_teacherID() {
        Hogwarts.log("getteacherid start");
        return _teacherID;
    }



    //TODO: Sign Up: Teachers can sign up by following these steps:
    //      Request an account by contacting the assistant.
    //      Upon receiving access, provide necessary information to complete the sign-up process.






    // Take Courses: Teachers can explore and enroll in courses they wish to teach, displayed on their dashboard.
    public void TakeCourse(Course pCourse) {
        Hogwarts.log("takecourse start");
        _courses.add(pCourse);
        pCourse.set_teacher(this);
        Hogwarts.log("takecourse end");
    }





    //TODO: Score Students: Teachers can evaluate students by navigating to the scoring section on their dashboard,
    //                      selecting the appropriate course, and entering scores for each student.








    // View Courses List: Access a comprehensive list of courses they teach for an overview of current teaching assignments.
    public ArrayList<Course> getCourses() {
        Hogwarts.log("getcourses start");
        return _courses;
    }
    // View Course's List of Students: Check the list of students enrolled in specific courses to monitor their progress.
    //!This function is implemented in course.
    public void showStudentsOf(Course pCourse) {
        Hogwarts.log("showstudentsof start");
        pCourse.showStudents();
        Hogwarts.log("showstudentsof end");
    }
    public void show() {
        Hogwarts.log("show start");
        System.out.println("\r\nteacherID: " + _teacherID.toString());
        System.out.println("fullname: " + _FullName);
    }




    //TODO: Show Teacher’s Score on the Menu: Conveniently monitor their teaching performance by checking their score displayed on the menu.



}
