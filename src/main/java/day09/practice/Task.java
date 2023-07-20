package day09.practice;

import java.time.LocalDate;
import java.util.*;

public class Task {
	private int id;
	private String name;
	
  @Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}

private LocalDate deadline;
  
  public int getId() {
	  return id;
  }
  public void setId(int id) {
	  this.id = id;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public LocalDate getDeadline() {
	  return deadline;
  }
  public void setDeadline(LocalDate deadline) {
	  this.deadline = deadline;
  }
  
  public Task(String name, int id, LocalDate deadline) {
	  this.name = name;
	  this.id = id;
	  this.deadline = deadline;
  }
  
  
}
