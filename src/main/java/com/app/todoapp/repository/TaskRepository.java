package com.app.todoapp.repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
//Repository is basically a class or application connecting your application to the database
// Task is the entity type
// long is the primary key type
public interface TaskRepository extends JpaRepository<Task, Long> {

}
