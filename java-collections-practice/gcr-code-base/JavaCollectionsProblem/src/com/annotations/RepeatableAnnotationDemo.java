package com.annotations;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

class IssueTracker {

    @BugReport(description = "NullPointerException occurs on invalid input")
    @BugReport(description = "Performance issue when processing large data")
    public void processTask() {
        System.out.println("Processing task...");
    }
}



public class RepeatableAnnotationDemo {

    public static void main(String[] args) throws Exception {

        Method method = IssueTracker.class.getMethod("processTask");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
