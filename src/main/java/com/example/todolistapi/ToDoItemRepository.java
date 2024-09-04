package com.example.todolistapi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoItemRepo extends JpaRepository<ToDoItem, Integer> {
}
