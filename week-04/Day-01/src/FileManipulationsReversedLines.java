import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class FileManipulationsReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reversed();
    }
    public static void reversed(){
        Path pathOfFile = Paths.get("C:\\Users\\Ediecz\\Desktop\\greenfox\\Edwards3ne\\week-04\\Day-01\\reversed-lines.txt");
        List<String> content=new ArrayList<String>();
        try {
        content = (Files.readAllLines(pathOfFile));
        }catch (Exception e){
        }
        String newLine="";
        for (int i = 0; i < content.size() ; i++) {
            String line = content.get(i);
            for (int j = line.length()-1  ; j >=0 ; j--) {
                newLine += line.charAt(j);

            }
            newLine += "\n";
        }

        System.out.println(newLine);

    }
}
