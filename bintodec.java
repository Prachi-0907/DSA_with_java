import java.util.Scanner;

public class BinaryToDecimalCore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        try {
            // Parse the binary string as a base-2 number
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("The decimal equivalent is: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input. Please enter a binary number containing only 0 and 1.");
        }

        scanner.close();
    }
}
