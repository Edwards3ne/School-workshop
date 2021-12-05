import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class FileManipulationsDoubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        decrypts();
    }
    public static void decrypts(){
        Path undecryptedFile = Paths.get("C:\\Users\\Ediecz\\Desktop\\greenfox\\Edwards3ne\\week-04\\Day-01\\duplicated-chars.txt");
        Path encryptedFile = Paths.get("C:\\Users\\Ediecz\\Desktop\\greenfox\\Edwards3ne\\week-04\\Day-01\\encrypted-chars.txt");
        List<String> encrypted = new ArrayList<String>();

        try {
            encrypted =(Files.readAllLines(undecryptedFile));
        }catch (Exception e){

        }

        String newLine = "";
        for (int i = 0; i < encrypted.size() ; i++) {
            String line =encrypted.get(i);
            for (int j = 0; j < line.length(); j+=2) {
                newLine+= line.charAt(j);

            }
            newLine += "\n";

        }

        try {
            Files.writeString(encryptedFile,newLine);
        }catch (Exception e){

        }



    }


}
