package com.linkedlist.circular.playlistmanagement;

public class MusicPlayList {

    private SongNode head;
    private SongNode current;

    // Add song at beginning
    public void addAtBeginning(String songName, String artist, double duration) {
        SongNode newNode = new SongNode(songName, artist, duration);

        if (head == null) {
            head = current = newNode;
        } else {
            SongNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            newNode.next = head;
            last.next = newNode;
            head = newNode;
        }
    }

    // Add song at end
    public void addAtEnd(String songName, String artist, double duration) {
        SongNode newNode = new SongNode(songName, artist, duration);

        if (head == null) {
            head = current = newNode;
        } else {
            SongNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    // Add song at specific position (1-based index)
    public void addAtPosition(int position, String songName, String artist, double duration) {
        if (position <= 1 || head == null) {
            addAtBeginning(songName, artist, duration);
            return;
        }

        SongNode newNode = new SongNode(songName, artist, duration);
        SongNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete song by name
    public void deleteSong(String songName) {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        SongNode curr = head;
        SongNode prev = null;

        do {
            if (curr.songName.equalsIgnoreCase(songName)) {

                if (curr == head && curr.next == head) {
                    head = current = null;
                } else {
                    if (curr == head) {
                        SongNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                    if (current == curr) {
                        current = curr.next;
                    }
                }
                System.out.println("Song deleted successfully");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Song not found");
    }

    // Play next song
    public void playNext() {
        if (current == null) {
            System.out.println("Playlist is empty");
            return;
        }
        current = current.next;
        playCurrent();
    }

    // Display current song
    public void playCurrent() {
        if (current != null) {
            System.out.println("Now Playing: " + current.songName +
                    " | Artist: " + current.artist +
                    " | Duration: " + current.duration + " mins");
        }
    }

    // Display entire playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty");
            return;
        }

        SongNode temp = head;
        do {
            System.out.println(
                "Song: " + temp.songName +
                ", Artist: " + temp.artist +
                ", Duration: " + temp.duration + " mins"
            );
            temp = temp.next;
        } while (temp != head);
    }
}
