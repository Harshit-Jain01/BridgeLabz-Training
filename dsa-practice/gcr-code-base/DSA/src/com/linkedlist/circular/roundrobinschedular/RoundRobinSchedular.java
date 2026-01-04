package com.linkedlist.circular.roundrobinschedular;

public class RoundRobinSchedular {


	    private ProcessNode head;
	    private int totalProcesses;

	    public void addProcess(int pid, int burstTime, int priority) {
	        ProcessNode p = new ProcessNode(pid, burstTime, priority);

	        if (head == null) {
	            head = p;
	            p.next = head;
	        } else {
	            ProcessNode temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = p;
	            p.next = head;
	        }
	        totalProcesses++;
	    }

	 
	    private void removeProcess(int pid) {
	        if (head == null) return;

	        ProcessNode curr = head;
	        ProcessNode prev = null;

	        do {
	            if (curr.pid == pid) {
	                if (curr == head && curr.next == head) {
	                    head = null;
	                } else {
	                    if (curr == head) {
	                        ProcessNode last = head;
	                        while (last.next != head) {
	                            last = last.next;
	                        }
	                        head = head.next;
	                        last.next = head;
	                    } else {
	                        prev.next = curr.next;
	                    }
	                }
	                totalProcesses--;
	                return;
	            }
	            prev = curr;
	            curr = curr.next;
	        } while (curr != head);
	    }

	
	    public void displayQueue() {
	        if (head == null) {
	            System.out.println("Queue Empty");
	            return;
	        }

	        ProcessNode temp = head;
	        do {
	            System.out.print("[P" + temp.pid + " BT:" + temp.burstTime + "] -> ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("(back to head)");
	    }

	    
	    public void simulate(int timeQuantum) {

	        int time = 0;
	        int totalWaitingTime = 0;
	        int totalTurnaroundTime = 0;
	        int completed = 0;

	        ProcessNode current = head;

	        while (head != null) {

	            displayQueue();

	            if (current.burstTime > timeQuantum) {
	                current.burstTime -= timeQuantum;
	                time += timeQuantum;
	                current = current.next;
	            } else {
	                time += current.burstTime;
	                current.burstTime = 0;

	                int turnaround = time;
	                int waiting = turnaround - current.originalBurst;

	                totalTurnaroundTime += turnaround;
	                totalWaitingTime += waiting;
	                completed++;

	                int pid = current.pid;
	                current = current.next;
	                removeProcess(pid);
	            }
	        }

	        System.out.println("\nAverage Waiting Time = " +
	                (double) totalWaitingTime / completed);
	        System.out.println("Average Turnaround Time = " +
	                (double) totalTurnaroundTime / completed);
	    }
	}


