import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* The assistant serves as an administrative tool, allowing administrators to create accounts, manage users,
 courses, and perform various administrative tasks to ensure smooth operation of the platform.
 */
public class Assistant {





    /* TODO: Sign Up: Only administrators (other assistants) can create new assistant accounts. Follow these steps to create a new assistant account:
                Access the admin panel.
                Utilize the provided tools to create a new assistant account.

     */
    /* TODO: Login: Admins can log in to their assistant accounts using their credentials.*/

    /* TODO: Remove a Teacher/Student: Assistants possess the authority to remove teachers or students from the platform:
                                 to the management section in the dashboard.
                                 Select the option to remove a teacher or student.
                                 Confirm the action to remove the selected user.*/

    // TODO: View Courses and Their List of Students: Explore the list of courses available on the platform and view enrolled students for each course.
    public static void viewCoursesAndTheirListOfStudents() throws IOException {
        for (Course c : Hogwarts.courses) {
            System.out.println("\r\ncourseID: " + c.courseID.toString());
            System.out.println("title: " + c.get_title());
            System.out.println("\tstudents: ");
            for (Student s : c.getEnrolledStudents()) {
                System.out.println("\t\tstudentID: " + s.get_studentID().toString());
                System.out.println("\t\tFullName: " + s.studentFullName);
            }
        }
    }


    // TODO: Check Student/Teacher Profile: Access detailed profiles for both students and teachers for administrative purposes.
    // Create a Course: Follow steps to create a new course on the platform:
    //                  Navigate to the course creation section in the dashboard.
    //                  Provide necessary details for the new course.
    //                  Confirm and save the course.
    public static void createCourse() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("creating Course...\r\nEnter title: ");
        String title = reader.readLine();
        System.out.println("Save? [Y/N]");
        String response = reader.readLine();
        if (!response.equals("n") && !response.equals("N")) {
            Course c = new Course();
            c.set_title(title);
            Hogwarts.courses.add(c);
        }
    }





}




