package pack1;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumbersEvenPrinte {
    public static void main(String[] args) {
        // Change to an absolute path if you want, e.g.:
        // File file = new File("C:\\Users\\Akanksha\\Documents\\numbers.txt");
        File file = new File("numbers.txt");

        // Print working directory to help you place the file correctly
        System.out.println("Working directory: " + new File(".").getAbsolutePath());

        // 1) Create numbers.txt if it doesn't exist
        if (!file.exists()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <= 10; i++) {
                    if (i > 0) sb.append(",");
                    sb.append(i);
                }
                writer.write(sb.toString());
                System.out.println("Created " + file.getAbsolutePath() + " with values 0..10");
            } catch (IOException e) {
                System.err.println("Failed to create numbers.txt: " + e.getMessage());
                return;
            }
        }

        // 2) Read using Scanner and print only even numbers
        try (Scanner sc = new Scanner(file)) {
            // Robust delimiter: commas and/or any whitespace (spaces/newlines/tabs)
            sc.useDelimiter("[,\\s]+");

            System.out.print("Even numbers in the file: ");
            boolean printedAny = false;

            while (sc.hasNext()) {
                if (!sc.hasNextInt()) {
                    // Consume and skip any non-integer token
                    sc.next();
                    continue;
                }
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                    printedAny = true;
                }
            }

            if (!printedAny) {
                System.out.print("(No even numbers found)");
            }
            System.out.println(); // newline
        } catch (IOException e) {
            System.err.println("Error reading numbers.txt: " + e.getMessage());
        }
    }
}
