import java.util.ArrayList;

/* Representing specific courses offered at Hogwarts School of Witchcraft and Wizardry,
 the Course class is capable of setting course information.*/
public class Course {
    private String _title; // Store the title of the course.
    private ArrayList<Student> _students = new ArrayList<>(); // Maintain a list of students enrolled in the course (students).
    private Teacher _teacher; // Track the teacher assigned to teach the course (teacher).
    public int courseID; // !!Assign a unique identifier to each course (courseID), represented by a UUID.
    Course() {
        courseID = 0;
        _title = "Default";
        System.out.println("course constructed.");
    }
    public String get_title() {
        return _title;
    }
    public void set_title(String title) {
        this._title = title;
        System.out.print("course.set_title called with ");
        System.out.println(title);
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




}
