import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
       Path file11 = Path.of("Folder 1/File 1-1.txt");
       Path file21 = Path.of("Folder 2/File 2-1.txt");
       Path file22 = Path.of("Folder 2/File 2-2.txt");
       List<String> content11 = Files.readAllLines(file11);
       List<String> content21 = Files.readAllLines(file21);
       List<String> content22 = Files.readAllLines(file22);
   }
}
