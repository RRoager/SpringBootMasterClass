package com.roager.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(todosCount++, "Rasmus", "Learn AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todosCount++, "Rasmus", "Learn Devops", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(todosCount++, "Rasmus", "Learn FullStack", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String name) {
        return todos.stream().filter(u -> u.getUsername().equalsIgnoreCase(name)).toList();
    }

    public void addTodo(String name, String description, LocalDate targetDate, boolean done) {
        todos.add(new Todo(todosCount++, name, description, targetDate, done));
    }

    public void deleteById(int id) {
        todos.removeIf(t -> t.getId() == id);
    }

    public Todo findById(int id) {
        return todos.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
