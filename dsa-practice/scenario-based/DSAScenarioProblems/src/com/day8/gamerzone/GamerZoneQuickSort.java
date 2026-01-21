package com.day8.gamerzone;

public class GamerZoneQuickSort {

    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(Player[] players, int low, int high) {
        int pivot = players[high].score; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Descending order
            if (players[j].score > pivot) {
                i++;
                swap(players, i, j);
            }
        }

        swap(players, i + 1, high);
        return i + 1;
    }

    private static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Alex", 1200),
            new Player("Neha", 1800),
            new Player("John", 1500),
            new Player("Meena", 2000),
            new Player("Sam", 1700)
        };

        quickSort(players, 0, players.length - 1);

        for (Player p : players) {
            System.out.println(p);
        }
    }
}
