package com.stackandqueue.queueusingstack;

import java.util.Stack;

class QueueUsingStack{
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public QueueUsingStack() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int x) {
        inStack.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (outStack.isEmpty()) {
            transfer();
        }

        return outStack.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (outStack.isEmpty()) {
            transfer();
        }

        return outStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Transfer elements from inStack to outStack
    private void transfer() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
