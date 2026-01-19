package com.collectionsframework.policymanagementsystemusingset;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsePolicy{

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy("P101", "Amit", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P102", "Neha", LocalDate.now().plusDays(40), "Auto", 7000);
        Policy p3 = new Policy("P103", "Ravi", LocalDate.now().plusDays(20), "Home", 9000);
        Policy p4 = new Policy("P101", "Amit Duplicate", LocalDate.now().plusDays(10), "Health", 5000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4); // duplicate

        manager.displayAllPolicies();
        manager.policiesExpiringSoon();
        manager.policiesByCoverage("Health");

        List<Policy> allPolicies = new ArrayList<>();
        allPolicies.add(p1);
        allPolicies.add(p2);
        allPolicies.add(p3);
        allPolicies.add(p4);

        manager.findDuplicatePolicies(allPolicies);
        manager.performanceTest(p1);
    }
}
