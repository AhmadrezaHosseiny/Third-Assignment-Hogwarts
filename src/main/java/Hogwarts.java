import java.util.ArrayList;

/* Serving as a central management system for Hogwarts School of Witchcraft and Wizardry,
 the Hogwarts class facilitates various actions for teachers, students, and administrators.*/
public class Hogwarts {

    // TODO: Define Attributes
    public static ArrayList<Course> courses = new ArrayList<>();
    public static void Init() {
        Student s1 = new Student();
        s1.studentFullName = "Student1";
        Student s2 = new Student();
        s2.studentFullName = "Student2";

        Course c1 = new Course();
        c1.set_title("Course1");
        courses.add(c1);
        Course c2 = new Course();
        c2.set_title("Course2");
        c2.Enroll(s1);
        courses.add(c2);
    }
    public void viewAllTeachers() {
        //TODO
    }

    public void viewAllStudents() {
        //TODO
    }

    public void viewAllCourses() {
        //TODO
    }

    // TODO: Managing lists of teachers, courses, admins, and students from different Houses.
    // TODO: Rating teachers and leaving comments for them.
    // TODO: Viewing all teachers, students, and courses.
    // TODO: Viewing individual student profiles.
    // TODO: Requesting courses and submitting scores for students.
    // TODO :Requesting courses as a teacher.
    // TODO: Rating teachers and leaving comments for them as a student.
    // TODO: Retrieving course information via UUID.
}
