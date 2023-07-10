package com.todo.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.springboot.model.ToDo;
import com.todo.springboot.repository.IToDoRepository;

@Service
public class ToDoService {
	
	@Autowired
	IToDoRepository repo;
   
	List<ToDo> getAllToDoItems(){
		ArrayList<ToDo> todoList = new ArrayList<>();
		repo.findAll().forEach(todo -> todoList.add(todo));
		return todoList;
		
	}
	public ToDo getToDoItemById(Long id){
		return repo.findById(id).get();
		
	}
	public boolean updateStatus(Long id){
		ToDo todo = getToDoItemById(id);
		todo.setStastus("Complete");
		
		return saveOrUpdateToDoItem(todo);
	}
	boolean saveOrUpdateToDoItem(ToDo todo){
		ToDo updatedObject = repo.save(todo);
		
		if(getToDoItemById(updatedObject.getId()) != null) {
			return true;
		}
		return false;
	}
	public boolean deleteToDoItem(Long id){
		repo.deleteById(id);
		
		if(getToDoItemById(id) == null) {
			return true;
		}
		return false;
	}
	
}
