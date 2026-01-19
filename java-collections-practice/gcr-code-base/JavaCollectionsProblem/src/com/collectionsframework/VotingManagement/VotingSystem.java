package com.collectionsframework.VotingManagement;

public class VotingSystem {

    public static void main(String[] args) {

        VoteManager manager = new VoteManager();

        manager.castVote("Alice");
        manager.castVote("Bob");
        manager.castVote("Alice");
        manager.castVote("Charlie");
        manager.castVote("Bob");

        manager.displayVotes();
        manager.displayVoteOrder();
        manager.displaySortedResults();
    }
}
