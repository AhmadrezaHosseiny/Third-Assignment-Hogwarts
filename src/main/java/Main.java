import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program started.");
        runMenu();
        System.out.println("Program ended.");
    }
    public static void runMenu() throws IOException {
        while (true) {
            System.out.println("""
                        
                        Welcome to Hogwarts
                         0: Exit
                         1: create Course
                         2: Students.method
                         3: Courses.method
                         4: Admins.method
                        
                       """);
            System.out.print("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 0:
                    return;
                case 1:
                    Assistant.create_course();
                    break;
                case 2:
                    System.out.println("Two.");
                    break;
                case 3:
                    System.out.println("Three.");
                    break;
                case 4:
                    System.out.println("Four.");
                    break;
            }
        }
    }
}
