package com.taskproject.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TaskDto {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	private long id;
	private String taskname;	
}
