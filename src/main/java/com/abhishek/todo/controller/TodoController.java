package com.abhishek.todo.controller;

import com.abhishek.todo.model.TodoResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @GetMapping
    public TodoResponseDto getTodo() {
        TodoResponseDto todoResponseDto = new TodoResponseDto();
        return todoResponseDto;
    }
}
