import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program started.\r\n");
        Hogwarts.Init();//ToDo remove after test
        runMenu();
        System.out.println("\r\nProgram ended.");
    }
    public static void runMenu() throws IOException {
        while (true) {
            System.out.println("""
                        
                        Welcome to Hogwarts
                         0: Exit
                         1: Init
                         2: Create Course
                         3: View Students of a Course
                          
                        
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
            }
        }
    }
}
