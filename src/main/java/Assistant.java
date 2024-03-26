import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* The assistant serves as an administrative tool, allowing administrators to create accounts, manage users,
 courses, and perform various administrative tasks to ensure smooth operation of the platform.
 */
public class Assistant {

    private Account _account;

    // Sign Up: Only administrators (other assistants) can create new assistant accounts.
    //               Access the admin panel.
    //               Utilize the provided tools to create a new assistant account.
    public static void Signup() throws IOException {
        Hogwarts.log("Signup start");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Username:");
            String Username = reader.readLine();
            System.out.print("Enter Password: ");
            String Password = reader.readLine();
            new Account(Username, Password);
            for (Account a : Hogwarts.accounts) a.show();
    }

    // Login: Admins can log in to their assistant accounts using their credentials.
    public static boolean Login() throws IOException {
        Hogwarts.log("login start");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("Enter Username:");
            String Username = reader.readLine();
            System.out.print("Enter Password: ");
            String Password = reader.readLine();
            boolean result = false;
            for (Account a : Hogwarts.accounts) {
                if (a.validateUserName(Username) && a.validatePassword(Password)) {
                    Hogwarts.CurrentAccount = a;
                    System.out.println("Login Successful");
                    return true;
                }
            }
        }
    }

    //TODO: Remove a Teacher/Student: Assistants possess the authority to remove teachers or students from the platform:
    //                                Navigate to the management section in the dashboard.
    //                                Select the option to remove a teacher or student.
    //                                Confirm the action to remove the selected user.







    // View Courses and Their List of Students: Explore the list of courses available on the platform and view enrolled students for each course.
    public static void viewCoursesAndTheirListOfStudents() throws IOException {
        Hogwarts.log("viewcourseandtheirstudents  start");
        for (Course c : Hogwarts.courses) {
            c.show();
            System.out.println("\tstudents: ");
            c.showStudents();
        }
        Hogwarts.log("viewcourseandtheirstudents  end");
    }






    //TODO: Check Student/Teacher Profile: Access detailed profiles for both students and teachers for administrative purposes.








    // Create a Course: Follow steps to create a new course on the platform:
    //                  Navigate to the course creation section in the dashboard.
    //                  Provide necessary details for the new course.
    //                  Confirm and save the course.
    public static void createCourse() throws IOException {
        Hogwarts.log("assistant.createcourse start");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("creating Course...\r\nEnter title: ");
        String title = reader.readLine();
        System.out.println("Save? [Y/N]");
        String response = reader.readLine();
        if (!response.equals("n") && !response.equals("N")) {
            Course c = Course.create(title);
        }
        Hogwarts.log("assistant.createcourse end");
    }





}




