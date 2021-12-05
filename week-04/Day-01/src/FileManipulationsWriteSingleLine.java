import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManipulationsWriteSingleLine {
    public static void main(String[] args) {
        writeSingleLine();
    }
    public static void writeSingleLine(){
        Path filePath = Paths.get("C:\\Users\\Ediecz\\Desktop\\greenfox\\Edwards3ne\\week-04\\Day-01\\src\\my-file.txt");
        System.out.println("What is your name?");
        Scanner userInput = new Scanner(System.in);
        String user = "";
        user = userInput.nextLine();
        List<String> content= new ArrayList<>();
        content.add(user);
        try {
            Files.write(filePath,content);
        }catch (Exception e){
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
