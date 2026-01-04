package com.linkedlist.circular.roundrobinschedular;

public class UseRoundRobinSchedular {

	    public static void main(String[] args) {

	        RoundRobinSchedular rr = new RoundRobinSchedular();

	        rr.addProcess(1, 10, 1);
	        rr.addProcess(2, 5, 2);
	        rr.addProcess(3, 8, 1);

	        int timeQuantum = 3;
	        rr.simulate(timeQuantum);
	    }
	}


