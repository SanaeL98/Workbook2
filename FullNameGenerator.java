package Strings;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for name parts
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // Build full name
        String fullName;
        if (!middleName.isEmpty()) {
            fullName = firstName + " " + middleName + ". " + lastName;
        } else {
            fullName = firstName + " " + lastName;
        }

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        // Print result
        System.out.println("Full name: " + fullName);
    }
}

