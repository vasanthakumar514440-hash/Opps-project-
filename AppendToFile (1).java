import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "example.txt"; // existing file

        System.out.println("Enter the text to append to the file:");
        String data = scanner.nextLine();

        // Try-with-resources ensures FileWriter is closed properly
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(data + System.lineSeparator());
            System.out.println("Data appended successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}