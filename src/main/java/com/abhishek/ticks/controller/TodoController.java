package com.abhishek.ticks.controller;

import com.abhishek.ticks.model.CreateTodoRequestDto;
import com.abhishek.ticks.model.TodoDto;
import com.abhishek.ticks.model.TodoResponseDto;
import com.abhishek.ticks.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public TodoResponseDto getTodos() {
        return todoService.getTodoResponseDto();
    }

    @PostMapping
    public TodoDto createTodo(@RequestBody CreateTodoRequestDto createTodoRequestDto) {
        return todoService.createTodo(createTodoRequestDto);
    }
}
