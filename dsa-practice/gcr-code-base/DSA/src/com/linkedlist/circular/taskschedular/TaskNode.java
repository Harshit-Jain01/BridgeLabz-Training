package com.linkedlist.circular.taskschedular;

public class TaskNode {
		
	int taskId;
	String taskName;
	int priority;
	String date;
	TaskNode next;
	public TaskNode(int taskId, String taskName, int priority, String date) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
		this.date = date;
		this.next = null;
	}	
	
}
