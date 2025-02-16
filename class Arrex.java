import java.util.ArrayList;
import java.util.Scanner;

class Medicine {
    private String name;
    private int quantity;
    private double price;

    public Medicine(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
}

public class PharmacyManagementSystem {
    private static ArrayList<Medicine> inventory = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Pharmacy Management System ===");
            System.out.println("1. Add Medicine");
            System.out.println("2. View Medicines");
            System.out.println("3. Purchase Medicine");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    viewMedicines();
                    break;
                case 3:
                    purchaseMedicine();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addMedicine() {
        System.out.print("Enter medicine name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        inventory.add(new Medicine(name, quantity, price));
        System.out.println("Medicine added successfully!");
    }

    private static void viewMedicines() {
        if (inventory.isEmpty()) {
            System.out.println("No medicines available.");
        } else {
            System.out.println("\nAvailable Medicines:");
            for (Medicine med : inventory) {
                System.out.println("Name: " + med.getName() + ", Quantity: " + med.getQuantity() + ", Price: " + med.getPrice());
            }
        }
    }

    private static void purchaseMedicine() {
        System.out.print("Enter medicine name to purchase: ");
        String name = scanner.nextLine();

        for (Medicine med : inventory) {
            if (med.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter quantity to purchase: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (quantity <= med.getQuantity()) {
                    med.setQuantity(med.getQuantity() - quantity);
                    System.out.println("Purchase successful! Total cost: " + (quantity * med.getPrice()));
                } else {
                    System.out.println("Insufficient stock available.");
                }
                return;
            }
        }
        System.out.println("Medicine not found.");
    }
}
