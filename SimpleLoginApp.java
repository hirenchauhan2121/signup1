import java.util.Scanner;

public class SimpleLoginApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sign Up (Capture Name and Mobile Number)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobile = scanner.nextLine();

        System.out.print("Create a username: ");
        String username = scanner.nextLine();

        System.out.print("Create a password: ");
        String password = scanner.nextLine();

        System.out.println("\nSignup successful! Now log in:");

        // Log In
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
            System.out.println("Login successful! Welcome, " + name + " (" + mobile + ")");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }

        scanner.close();
    }
}