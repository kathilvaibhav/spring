package com.programmingfree.springservice.domain;

import java.util.ArrayList;
import java.util.List;


public class Task {
	
	private int task_id;
	 private String task_name;
	 private String task_description; 
	 private String task_priority;
	 private String task_status;
	 
	 public int getTaskId() {
	  return task_id;
	 }
	 public void setTaskId(int taskId) {
	  this.task_id = taskId;
	 }
	 public String getTaskName() {
	  return task_name;
	 }
	 public void setTaskName(String taskName) {
	  this.task_name = taskName;
	 }
	 public String getTaskDescription() {
	  return task_description;
	 }
	 public void setTaskDescription(String taskDescription) {
	  this.task_description = taskDescription;
	 }
	 
	 
	 public String getTaskPriority() {
	  return task_priority;
	 }
	 public void setTaskPriority(String taskPriority) {
	  this.task_priority = taskPriority;
	 }
	 
	 public String getTaskStatus() {
			return task_status;
		}
	 
	public void setTaskStatus(String taskStatus) {
			this.task_status = taskStatus;
		}
		
	 @Override
	 public String toString() {
	  return "Task [task_id=" + task_id + ", task_name=" + task_name
	    + ", task_description=" + task_description + ", task_priority="
	    + task_priority +",task_status="+task_status+ "]";
	 }
    public static List<Task> getAllTasks() {
        // TODO Auto-generated method stub
     List<Task> list = new ArrayList<Task>();     
     Task t = new Task();     
     t.task_id  = 10;
     t.task_name = "First Task";
     t.task_description = "Task Descritpion"; 
     t.task_priority = "LOW";
     t.task_status = "ACTIVE";     
     
     Task t1 = new Task();
     
     t1.task_id  = 20;
     t1.task_name = "Second Task";
     t1.task_description = "Task Descritpion"; 
     t1.task_priority = "LOW";
     t1.task_status = "ACTIVE";
     list.add(t);
     list.add(t1);
     return list;
     
     
    }
	  

}
