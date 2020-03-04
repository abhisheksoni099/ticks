package com.abhishek.ticks.service;

import com.abhishek.ticks.model.CreateTodoRequestDto;
import com.abhishek.ticks.model.Todo;
import com.abhishek.ticks.model.TodoDto;
import com.abhishek.ticks.model.TodoResponseDto;
import com.abhishek.ticks.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodaysTodos() {
        return todoRepository.findByArchived(false);
    }

    public TodoResponseDto getTodoResponseDto() {
        TodoResponseDto todoResponseDto = new TodoResponseDto();
        todoResponseDto.setTodos(getTodaysTodos());
        return todoResponseDto;
    }

    public TodoDto createTodo(CreateTodoRequestDto createTodoRequestDto) {
        Todo todo = new Todo();
        todo.setLabel(createTodoRequestDto.getLabel());
        todo.setArchived(false);
        todo.setDateCreated(new Date());
        todo.setDone(false);
        todoRepository.save(todo);
        return buildNewTodoDto(todo);
    }

    public TodoDto buildNewTodoDto(Todo todo) {
        TodoDto todoDto = new TodoDto();
        todoDto.setId(todo.getId());
        todoDto.setLabel(todo.getLabel());
        return todoDto;
    }
}
