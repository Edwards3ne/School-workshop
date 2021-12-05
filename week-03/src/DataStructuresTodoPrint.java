
public class DataStructuresTodoPrint {
    public static void main(String... args) {
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText applying indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        StringBuilder newTodo = new StringBuilder(todoText);
        StringBuilder myTodo = new StringBuilder("My todo \n");
        newTodo = myTodo.append(newTodo);
        newTodo = myTodo.append(" - Download games\n     - Diablo");
        System.out.println(newTodo);
    }
}

