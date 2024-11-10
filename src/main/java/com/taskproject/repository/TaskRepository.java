package com.taskproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taskproject.entity.Task;


public interface TaskRepository extends JpaRepository<Task, Long>{

}
