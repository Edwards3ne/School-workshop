import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManipulationsCopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another file
        // It should take two filenames (string) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows if the copy was successful
        copyFile("newfile.txt","newnewfile2.txt");
    }
    public static void copyFile (String first,String second){
        Path firstPath = Paths.get(first);
        Path secondPath = Paths.get(second);
        try {
            Files.copy(firstPath,secondPath);
        }catch (Exception e){

        }finally {
            System.out.println(true);
        }

    }
}
