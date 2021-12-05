package printable;

import Dominoes.Domino;
import Dominoes.Dominoes;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Domino2> dominoes = new ArrayList<>();
        dominoes.add(new Domino2(5, 2));
        dominoes.add(new Domino2(4, 6));
        dominoes.add(new Domino2(1, 5));
        dominoes.add(new Domino2(6, 7));
        dominoes.add(new Domino2(2, 4));
        dominoes.add(new Domino2(7, 1));

        List<Todo> todoes = new ArrayList<>();
        todoes.add(new Todo("Buy milk","high",true));
        todoes.add(new Todo("Clean boots","medium",true));
        todoes.add(new Todo("feed cat","low",false));

        for (Domino2 domino2 : dominoes) {
            domino2.printAllFields();
        }
        for (Todo todo : todoes) {
            todo.printAllFields();
        }
    }
}
