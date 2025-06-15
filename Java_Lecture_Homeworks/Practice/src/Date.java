import java.util.Scanner;

// Custom Exception Class for Invalid Day Input
class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

public class Date {
    public static void validateDate(String date) throws InvalidDayException {
        String[] parts = date.split("/");

        if (parts.length != 3) {
            throw new InvalidDayException("Invalid format. Use dd/mm/yy.");
        }

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Check for invalid day
        if (day < 1 || day > 31) {
            throw new InvalidDayException("Invalid day: " + day);
        }

        // Additional validation for months
        if (month < 1 || month > 12) {
            throw new InvalidDayException("Invalid month: " + month);
        }

        // Assuming year validation is not required for this problem
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date in dd/mm/yy format: ");
        String date = scanner.nextLine();

        try {
            validateDate(date);
            System.out.println("Valid date: " + date);
        } catch (InvalidDayException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
