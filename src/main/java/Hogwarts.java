import java.util.ArrayList;

/* Serving as a central management system for Hogwarts School of Witchcraft and Wizardry,
 the Hogwarts class facilitates various actions for teachers, students, and administrators.*/
public class Hogwarts {
    public static ArrayList<Teacher> teachers = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();
    public static void Init() {
        System.out.println("\r\ninitialising...\r\n");

        Teacher t1 = new Teacher(" Ali");
        Teacher t2 = new Teacher(" Hassan");
        Teacher t3 = new Teacher(" John");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        Student s4 = new Student("Dan");
        Student s5 = new Student("Erfan");
        Student s6 = new Student("Farid");

        Course c1 = Course.create("C++");
        Course c2 = Course.create("Python");
        Course c3 = Course.create("Java");

        c1.set_teacher(t1);
        c2.set_teacher(t2);
        c3.set_teacher(t2);

        c1.Enroll(s1);
        c1.Enroll(s2);
        c1.Enroll(s3);
        c2.Enroll(s1);
        c2.Enroll(s2);
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
