import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManipulationsReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reversedOrder();
    }
    public static void reversedOrder(){
        Path pathFile = Paths.get("C:\\Users\\Ediecz\\Desktop\\greenfox\\Edwards3ne\\week-04\\Day-01\\reversed-order.txt");
        List<String> content=new ArrayList<String>();
        try {
            content = (Files.readAllLines(pathFile));
        }catch (Exception e){
        }
        String newLine="";
        for (int i = content.size()-1; i >=0 ; i--) {
            String line = content.get(i);
            for (int j = 0 ; j <line.length() ; j++) {
                newLine += line.charAt(j);

            }
            newLine += "\n";
        }
        System.out.println(newLine);
    }

}
