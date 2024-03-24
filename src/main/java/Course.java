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
        courseID = pID;
        _title = title;
        Hogwarts.courses.add(this);
        System.out.println("Course " + _title + " constructed.");
    }
    public static Course create(String title) {
        return new Course(UUID.randomUUID(), title);
    }
    public UUID getCourseID() {
        return courseID;
    }
    public String get_title() {
        return _title;
    }
    public void set_title(String title) {
        this._title = title;
        System.out.println("course.set_title( " + title + " ) ");
    }
    public Teacher get_teacher() {
        return _teacher;
    }
    public void set_teacher(Teacher _teacher) {
        this._teacher = _teacher;
    }
    public void Enroll(Student pStudent) {
        _students.add(pStudent);
    }
    public ArrayList<Student> getEnrolledStudents() {
        return _students;
    }
    public void showStudents( ) {
        showStudents("\t\t");
    }
    public void showStudents(String prefix) {
        for (Student s : _students) {
            s.show(prefix);
        }
    }
    public void show() {
        System.out.println("\r\ncourseID: " + this.courseID.toString());
        System.out.println("title: " + this.get_title());
    }
}
