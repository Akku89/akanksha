package pack1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab_4_1 {
    public static void main(String[] args) {
        String filePath = "sample.txt";   // your file name

        try {
            // Step 1: Read the file content
            FileReader reader = new FileReader(filePath);
            StringBuilder content = new StringBuilder();

            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();

            // Step 2: Reverse the content
            content.reverse();

            // Step 3: Write reversed content back into the same file
            FileWriter writer = new FileWriter(filePath);
            writer.write(content.toString());
            writer.close();

            System.out.println("File content reversed successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

