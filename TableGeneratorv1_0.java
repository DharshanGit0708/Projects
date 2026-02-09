import java.util.Scanner;

public class TableGeneratorv1_0 {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Multiplication Table Generator!");
        System.out.println("---------------------------------------------");
        
        Scanner scanner = new Scanner(System.in);

        // 1. Get Inputs
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter how many multiples to display: ");
        int count = scanner.nextInt();
        
        // 2. Logic from Code #1: Dynamic Alignment
        // Calculate width based on the largest number (count)
        int width = String.valueOf(count).length();
        
        // Create the format string dynamically (e.g., "%d x %3d = %d%n")
        String tableFormat = "%d x %" + width + "d = %d%n";

        // 3. Logic from Code #2: Generate the Table
        System.out.println("\n--- Full Table ---");
        for (int i = 1; i <= count; i++) {
            // Use the dynamic 'tableFormat' variable here
            System.out.printf(tableFormat, number, i, (number * i));
        }

        // 4. Logic from Code #2: Quick Lookup Feature
        System.out.println("\n--- Quick Lookup ---");
        System.out.println("Enter a multiplier to get the result instantly.");
        System.out.println("Enter 0 to exit the program.");

        while (true) {
            System.out.print("Check multiplier: ");
            int pick = scanner.nextInt();

            if (pick == 0) {
                System.out.println("Thank You, anytime!");
                break; // Exit the loop
            }

            // Print the specific result
            System.out.printf(">> RESULT: %d x %d = %d%n", number, pick, (number * pick));
        }
        
        scanner.close();
    }
}