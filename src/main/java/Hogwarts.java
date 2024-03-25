import java.util.ArrayList;

/* Serving as a central management system for Hogwarts School of Witchcraft and Wizardry,
 the Hogwarts class facilitates various actions for teachers, students, and administrators.*/
public class Hogwarts {
    public static ArrayList<Teacher> teachers = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();
    public static boolean debug = true;
    public static String prefix = "-->";
    public static void log(String s) {
        if (Hogwarts.debug) System.out.println(prefix + s);
    }
    public static void Init() {
        Hogwarts.log("init start");

        System.out.println("\r\ninitialising...\r\n");
        Hogwarts.log(Integer.toString(Hogwarts.teachers.size()));
        Teacher t1 = Teacher.create(" Ali");
        Hogwarts.log(Integer.toString(Hogwarts.teachers.size()));
        Teacher t2 = Teacher.create(" Hassan");
        Hogwarts.log(Integer.toString(Hogwarts.teachers.size()));
        Teacher t3 = Teacher.create(" John");
        Hogwarts.log(Integer.toString(Hogwarts.teachers.size()));

        Student s1 = Student.create("Alice");
        Hogwarts.log(Integer.toString(Hogwarts.students.size()));
        Student s2 = Student.create("Bob");
        Hogwarts.log(Integer.toString(Hogwarts.students.size()));
        Student s3 = Student.create("Charlie");Hogwarts.log(Integer.toString(Hogwarts.students.size()));
        Student s4 = Student.create("Dan");Hogwarts.log(Integer.toString(Hogwarts.students.size()));
        Student s5 = Student.create("Erfan");Hogwarts.log(Integer.toString(Hogwarts.students.size()));
        Student s6 = Student.create("Farid");Hogwarts.log(Integer.toString(Hogwarts.students.size()));

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

    //TODO: Managing lists of teachers, courses, admins, and students from different Houses.
    //TODO: Rating teachers and leaving comments for them.
    //TODO: Viewing all teachers, students, and courses.
    //TODO: Viewing individual student profiles.
    //TODO: Requesting courses and submitting scores for students.
    //TODO :Requesting courses as a teacher.
    //TODO: Rating teachers and leaving comments for them as a student.
    //TODO: Retrieving course information via UUID.
}
