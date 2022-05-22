import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path file11 = Path.of("Folder 1/File 1-1.txt");
        Path file21 = Path.of("Folder 2/File 2-1.txt");
        Path file22 = Path.of("Folder 2/File 2-2.txt");
        ArrayList<Path> files = new ArrayList<>();
        files.add(file11);
        files.add(file21);
        files.add(file22);
        for (Path loopFile :
                files) {
            List<String> loopFileContent = Files.readAllLines(loopFile);
            for (String s:
                 loopFileContent) {
                String[] charArray = s.split(" ");
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i].equals("require")){
                    StringBuilder fileString = new StringBuilder(s).delete(0,8).deleteCharAt(0);
                    fileString.deleteCharAt(fileString.length()-1);
                        File f = new File(fileString.append(".txt").toString());
                        System.out.println(f.toString());
                    }
                }
            }
        }
    }
}
