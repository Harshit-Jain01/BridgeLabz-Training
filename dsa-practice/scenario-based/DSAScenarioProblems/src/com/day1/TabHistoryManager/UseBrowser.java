package com.day1.TabHistoryManager;

public class UseBrowser {

    public static void main(String[] args) {

        Browser browse = new Browser();

        System.out.println("Tab 1");
        Tab t1 = new Tab();
        t1.addWeb("Instagram");
        t1.addWeb("Story");
        t1.addWeb("User Profile");
        t1.backwardHistory();

        System.out.println("\nTab 2");
        Tab t2 = new Tab();
        t2.addWeb("Google");
        t2.addWeb("Gmail");
        t2.addWeb("Google Drive");
        t2.addWeb("YouTube");
        t2.backwardHistory();
        t2.forwardHistory();

        browse.deleteTab(t1);

        System.out.println("\nRestored Tab");
        Tab restored = browse.restoreTab();
        if (restored != null) {
            restored.backwardHistory();
        }
    }
}
