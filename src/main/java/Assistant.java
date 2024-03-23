import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assistant {
    // Create a Course: Follow steps to create a new course on the platform:
    //                  Navigate to the course creation section in the dashboard.
    //                  Provide necessary details for the new course.
    //                  Confirm and save the course.
    public static void create_course() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("creating Course...\r\nEnter title: ");
        String title = reader.readLine();
        System.out.println("Save? [Y/N]");
        String response = reader.readLine();
        if (!response.equals("n")) {

            Course c = new Course();
            c.set_title(title);
            Hogwarts.courses.add(c);
        }
    }
}
