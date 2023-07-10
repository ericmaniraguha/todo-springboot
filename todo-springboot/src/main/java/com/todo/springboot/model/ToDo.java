package com.todo.springboot.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "todo")
public class ToDo {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String Title;
	
	@Column
	private Date date;
	
	@Column
	private String status;
	
	@Column
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStastus(String stastus) {
		this.status = status;
	}
	public ToDo(Long id, String title, Date date, String status) {
		super();
		this.id = id;
		Title = title;
		this.date = date;
		this.status = status;
	}
	public ToDo() {
	}
	
	
	
}
