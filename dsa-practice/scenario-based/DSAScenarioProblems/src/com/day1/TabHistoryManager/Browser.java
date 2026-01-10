package com.day1.TabHistoryManager;

import java.util.Stack;

public class Browser {

    private Stack<Tab> stack = new Stack<>();

    public void deleteTab(Tab t) {
        stack.push(t);
        System.out.println("Tab removed");
    }

    public Tab restoreTab() {
        if (stack.isEmpty()) {
            System.out.println("No tab to restore");
            return null;
        }
        System.out.println("Tab restored");
        return stack.pop();
    }
}
