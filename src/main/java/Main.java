import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Hogwarts.log("Program started.\r\n");
        Hogwarts.Init();//ToDo: remove after test
        runMenu();
        Hogwarts.log("\r\nProgram ended.");
    }
    public static void runMenu() throws IOException {
        while (true) {
            System.out.println("""
                        
                        Welcome to Hogwarts
                         0: Exit
                         1: Hogwarts.Init()
                         2: Assistant.createCourse()
                         3: Assistant.viewCoursesAndTheirListOfStudents()
                         4: Student.show_teachers_taken_courses_with_for_all_students()
                        
                       """);
            System.out.print("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 0:
                    return;
                case 1:
                    Hogwarts.Init();
                    break;
                case 2:
                    Assistant.createCourse();
                    break;
                case 3:
                    Assistant.viewCoursesAndTheirListOfStudents();
                    break;
                case 4:
                    Student.show_teachers_taken_courses_with_for_all_students();
                    break;
            }
        }
    }
}
