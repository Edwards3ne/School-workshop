import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileManipulationsCountLines {
    public static void main(String[] args) {
        howMannyLines();
    }
    public static void howMannyLines (){
        Path filePath = Paths.get("C:\\Users\\Ediecz\\Desktop\\greenfox\\Edwards3ne\\week-04\\Day-01\\src\\my-file.txt");
        List all= new ArrayList();

        try {
            all= Files.readAllLines(filePath, StandardCharsets.UTF_8);
        }catch (Exception e){
            System.out.println("0");
        }
        System.out.println(all.size());
        System.out.println(all);

    }
}
