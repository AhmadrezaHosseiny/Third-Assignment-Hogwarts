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

            System.out.println("Welcome to Hogwarts\r\n" +
                    " 0: Exit\r\n" +
                    " 1: Teachers.method\r\n" +
                    " 2: Students.method\r\n" +
                    " 3: Courses.method\r\n" +
                    " 4: Admins.method\r\n" +
                    "\r\nEnter your choice:");

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
