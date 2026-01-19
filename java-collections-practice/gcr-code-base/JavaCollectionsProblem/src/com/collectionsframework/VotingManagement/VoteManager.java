package com.collectionsframework.VotingManagement;

import java.util.*;

public class VoteManager {

    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();

    // Cast vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
    }

    // Display votes using HashMap
    public void displayVotes() {
        System.out.println("Votes stored in HashMap");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Display votes in insertion order using LinkedHashMap
    public void displayVoteOrder() {
        System.out.println("Votes in insertion order");
        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Display sorted results using TreeMap
    public void displaySortedResults() {
        System.out.println("Votes in sorted order");
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
