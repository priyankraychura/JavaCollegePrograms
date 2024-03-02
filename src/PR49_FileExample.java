import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class PR49_FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("myFile.txt");
            Files.write(file.toPath(), "Hello, world!".getBytes(StandardCharsets.UTF_8));
            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
