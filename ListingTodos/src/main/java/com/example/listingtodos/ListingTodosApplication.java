package com.example.listingtodos;

import com.example.listingtodos.entity.Todo;
import com.example.listingtodos.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodosApplication implements CommandLineRunner {
    private final TodoRepository todoRepository;

    public ListingTodosApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListingTodosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        todoRepository.save(Todo.builder().title("I have to learn Object Relational Mapping").build());
        todoRepository.save(Todo.builder().title("everything").build());

//        Todo todo= new Todo();
//        todo.setTitle("I have to learn Object Relational Mapping");
//        Todo todo2=new Todo();
//        todo2.setTitle("everything");
//        todoRepository.save(todo);
//        todoRepository.save(todo2);

    }
}
