package pack1;

import java.io.*;

public class ReverseFirstFile {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Akanksha.Choudhary\\OneDrive - Coforge Limited\\Desktop\\git\\first.txt.txt"); // Your existing file

        try {
            // Step 1: Read content from file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Step 2: Reverse the content
            String reversedContent = content.reverse().toString();

            // Step 3: Write reversed content back to first.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(reversedContent);
            writer.close();

            System.out.println("Content of first.txt reversed successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

