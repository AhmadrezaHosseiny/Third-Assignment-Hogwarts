import java.util.ArrayList;
import java.util.UUID;

/* Representing specific courses offered at Hogwarts School of Witchcraft and Wizardry,
 the Course class is capable of setting course information.*/
public class Course {
    private String _title; // Store the title of the course.
    private ArrayList<Student> _students = new ArrayList<>(); // Maintain a list of students enrolled in the course (students).
    private UUID courseID; // Assign a unique identifier to each course (courseID), represented by a UUID.
    public Teacher _teacher; // Track the teacher assigned to teach the course (teacher).
    Course(UUID pID, String title) {
        Hogwarts.log("course constructor start");
        courseID = pID;
        _title = title;
        Hogwarts.courses.add(this);
        Hogwarts.log("Course " + courseID.toString() + " " + _title + " constructed.");
    }
    public static Course create(String title) {
        Hogwarts.log("create start");
        return new Course(UUID.randomUUID(), title);
    }
    public UUID getCourseID() {
        Hogwarts.log("getcourseid start");
        return courseID;
    }
    public String get_title() {
        Hogwarts.log("gettitle start");
        return _title;
    }
    public void set_title(String title) {
        Hogwarts.log("course.settitle start");
        this._title = title;
    }
    public Teacher get_teacher() {
        Hogwarts.log("getteacher start");
        return _teacher;
    }
    public void set_teacher(Teacher _teacher) {
        Hogwarts.log("set teacher start");
        this._teacher = _teacher;
    }
    public void Enroll(Student pStudent) {
        Hogwarts.log("enroll start");
        _students.add(pStudent);
        pStudent.AddCourse(this);
    }
    public ArrayList<Student> getEnrolledStudents() {
        Hogwarts.log("getEnrolledStudents start");
        return _students;
    }
    public void showStudents( ) {
        Hogwarts.log("showStudents start");
        showStudents("\t\t");
    }
    public void showStudents(String prefix) {
        Hogwarts.log("showstudents start");
        for (Student s : _students) {
            s.show(prefix);
        }
    }
    public void show() {
        Hogwarts.log("show start");
        System.out.println("\r\ncourseID: " + this.courseID.toString());
        System.out.println("title: " + this.get_title());
        Hogwarts.log("show end");
    }
}
