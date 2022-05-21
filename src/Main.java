import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
       Path file11 = Path.of("Folder 1/File 1-1.txt");
       Path file21 = Path.of("Folder 2/File 2-1.txt");
       Path file22 = Path.of("Folder 2/File 2-2.txt");
       List<String> content11 = Files.readAllLines(file11);
       List<String> content21 = Files.readAllLines(file21);
       List<String> content22 = Files.readAllLines(file22);
       ArrayList<List<String>> filesContent = new ArrayList<>();
       filesContent.add(content11);
       filesContent.add(content21);
       filesContent.add(content22);
       for (String s:
            content11) {
          if (s.equals("require ‘Folder 1/File 1-1’")){
             System.out.println("Привет!");
          }
       }
   }
}
