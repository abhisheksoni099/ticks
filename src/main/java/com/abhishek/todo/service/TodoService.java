package com.abhishek.todo.service;

import com.abhishek.todo.model.Todo;
import com.abhishek.todo.model.TodoResponseDto;
import com.abhishek.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public TodoResponseDto getTodoResponse() {
        List<Todo> todos = getTodos();
        TodoResponseDto todoResponseDto = buildTodos(todos);
        return todoResponseDto;
    }

    public TodoResponseDto buildTodos(List<Todo> todos) {
        TodoResponseDto todoResponseDto = new TodoResponseDto();
//        todoResponseDto.se
        return todoResponseDto;
    }
}
