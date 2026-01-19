package pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab_4_2 {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        createNumbersFile(fileName);   // Step 1: create file with 0..10 comma-separated
        printEvenNumbersFromFile(fileName); // Step 2: read with Scanner and print evens
    }

    // Creates numbers.txt with "0,1,2,3,4,5,6,7,8,9,10"
    private static void createNumbersFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i <= 10; i++) {
                writer.write(String.valueOf(i));
                if (i < 10) writer.write(","); // comma delimiter
            }
            System.out.println("File created: " + fileName);
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    // Reads with Scanner and prints only even numbers
    private static void printEvenNumbersFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.err.println("File not found: " + fileName);
            return;
        }

        // Use comma as delimiter for Scanner
        try (Scanner sc = new Scanner(file)) {
            sc.useDelimiter(",");   // treat commas as token separators
            System.out.println("Even numbers in the file:");
            while (sc.hasNext()) {
                String token = sc.next().trim();
                if (token.isEmpty()) continue;
                try {
                    int num = Integer.parseInt(token);
                    if (num % 2 == 0) {
                        System.out.print(num + " ");
                    }
                } catch (NumberFormatException nfe) {
                    // Skip invalid tokens gracefully
                }
            }
            System.out.println(); // newline at end
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

