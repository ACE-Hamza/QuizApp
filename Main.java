
// import java.util.*;
import java.util.Scanner;
// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {
            System.out.println("Choose a topic for the Quiz: ");
            System.out.println("1. Computers.");
            System.out.println("2. Mathematics.");
            System.out.println("3. Science.");
            System.out.println("4. Exit");

            System.out.println("Enter the number associated with the topic of your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Computer.computer();
                    break;
                case 2:
                    Maths.maths();
                    break;
                case 3:
                    Science.science();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option entered");
            }
        }
        sc.close();
    }
}