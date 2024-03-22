/*
    TODO: Import all the classes that you have defined and make use of them to build the program.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runMenu();

    }

    public static void runMenu() {
        while (true) {

            System.out.println("""
                        Welcome to Hogwarts
                         0: Exit
                         1: Teachers.method
                         2: Students.method
                         3: Courses.method
                         4: Admins.method
                        
                        Enter your choice:""");

            Scanner in = new Scanner(System.in);
            int i = in.nextInt();
            switch (i) {
                case 0:
                    return;
                case 1:
                    System.out.println("One.");
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
