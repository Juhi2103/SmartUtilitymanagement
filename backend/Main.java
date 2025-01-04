package backend.src;

import backend.src.models.User;
import backend.src.services.UserService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Smart Utility Management System!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Register User");
            System.out.println("2. Display All Users");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    userService.registerUser(name, email);
                    break;
                case 2:
                    userService.displayAllUsers();
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
