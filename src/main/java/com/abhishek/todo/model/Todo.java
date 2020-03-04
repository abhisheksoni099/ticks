package com.abhishek.todo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Todo {
    private String label;
    private Boolean done;
}
