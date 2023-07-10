package com.todo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.springboot.model.ToDo;

@Repository
public interface IToDoRepository extends JpaRepository<ToDo, Long>{

}
