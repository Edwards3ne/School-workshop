import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileManipulationsPrintEachLine {
    public static void main(String[] args) {
        readFile();



    }

    public static void readFile() {
        Path filePath = Paths.get("C:\\Users\\Ediecz\\Desktop\\greenfox\\Edwards3ne\\week-04\\Day-01\\src\\my-file.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines =Files.readAllLines(filePath,StandardCharsets.UTF_8);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Unable to read file: my-file.txt");
        }

        for (String line:lines){
            System.out.println(line);
        }

    }

}

