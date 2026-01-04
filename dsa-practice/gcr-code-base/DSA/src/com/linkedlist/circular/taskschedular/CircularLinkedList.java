package com.linkedlist.circular.taskschedular;



public class CircularLinkedList {
	TaskNode head;
	TaskNode current;
	public void addAtLast(int taskId, String taskName, int priority, String date) {
		TaskNode p=new TaskNode(taskId,taskName,priority,date);
		if(head==null) {
			p.next=p;
			head=p;
			return;
		}
		TaskNode temp=head;
		while(temp.next!=head)
			temp=temp.next;
		temp.next=p;
		p.next=head;
	}
	
	public void addAtBegining(int taskId, String taskName, int priority, String date) {
		TaskNode p=new TaskNode(taskId,taskName,priority,date);
		if(head==null) {
			p.next=p;
			head=p;
			return;
		}
		TaskNode temp=head;
		while(temp.next!=head)
			temp=temp.next;
		p.next=head;
		head=p;
		temp.next=p;
	
	}
	public void addAtPosition(int taskId, String taskName, int priority, String date,int pos) {
		TaskNode p=new TaskNode(taskId,taskName,priority,date);
		TaskNode temp=head;
		 if(pos==0) {
			while(temp.next!=head) {
				temp=temp.next;
			}
			p.next=head;
			temp.next=p;
			head=p;
			
		}
		else {
			int c=0;
			while(c<pos-1 && temp.next!=head) {
				temp=temp.next;
				c++;
			}
			if(c!=pos-1)
			{
				System.out.println("Invalid position");
				System.out.println("---");
				return;
				
			}
			p.next=temp.next;
			temp.next=p;
		
		}	
	}
	public void viewNextTask() {
	    if (head == null) {
	        System.out.println("No tasks available");
	        return;
	    }

	    if (current == null)
	        current = head;

	    System.out.println("Current Task:");
	    System.out.println(
	        current.taskId + " " + current.taskName +
	        " | Priority: " + current.priority +
	        " | Due: " + current.date
	    );

	    current = current.next;
	}

	
	public void remove(int taskId) {
		 if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
		 if (head.taskId == taskId && head.next == head) {
	            head = null;
	            return;
	        }
		TaskNode temp=head;
		if(taskId==head.taskId) {
			while(temp.next!=head) 
				temp=temp.next;
			temp.next=head.next;
			head=head.next;	
			 System.out.println("Removed task Id " + taskId);
			    return;
		}
		else {
			temp=temp.next;
			TaskNode prev=head;
			while(temp!=head) {	
				if(temp.taskId==taskId) {
					prev.next=temp.next;
					temp.next=null;
					System.out.println("Removed task Id"+taskId);
					return;
				}
				prev=temp;
				temp=temp.next;
			}
		}
		System.out.println("TaskID is not present");
	}
	
	public void search(int priority) {
		if(head==null)return;
		TaskNode temp=head;
		 boolean found = false;
		do {
            if (temp.priority == priority) {
                System.out.println("Task Found:");
                System.out.println(temp.taskId + " " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task with priority " + priority);
	}
	public void display() {
		if(head==null)
			System.out.println("List has no node");
		else {
			TaskNode temp=head;
			do {
				System.out.println("Task id is "+temp.taskId+"\nTask Name is"+temp.taskName+"\nPriority is "+temp.priority+"\ndue date is"+temp.date);
				System.out.println("---");
				temp=temp.next;
			}while(temp!=head);
			
		}
	}
}
