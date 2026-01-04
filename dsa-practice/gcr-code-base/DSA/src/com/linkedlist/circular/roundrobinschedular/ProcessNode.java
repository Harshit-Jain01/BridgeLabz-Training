package com.linkedlist.circular.roundrobinschedular;

public class ProcessNode {

    int pid;
    int burstTime;
    int priority;
    int originalBurst;
    ProcessNode next;

    public ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.originalBurst = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
