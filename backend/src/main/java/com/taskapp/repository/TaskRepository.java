package com.taskapp.repository;

import com.taskapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(String userId);
    List<Task> findByStatusAndPriority(Task.TaskStatus status, Task.Priority priority);
    List<Task> findByNextExecutionAtBefore(LocalDateTime dateTime);
}