package com.task.TaskApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.TaskApp.models.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

}
