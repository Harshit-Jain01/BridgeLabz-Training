package com.linkedlist.circular.playlistmanagement;

public class UsePlaylist{
    public static void main(String[] args) {

        MusicPlayList playlist = new MusicPlayList();

        playlist.addAtEnd("Believer", "Imagine Dragons", 3.5);
        playlist.addAtEnd("Shape of You", "Ed Sheeran", 4.2);
        playlist.addAtBeginning("Perfect", "Ed Sheeran", 4.6);
        playlist.addAtPosition(2, "Thunder", "Imagine Dragons", 3.2);

        System.out.println("Playlist:");
        playlist.displayPlaylist();

        System.out.println("\nPlaying songs:");
        playlist.playCurrent();
        playlist.playNext();
        playlist.playNext();

        System.out.println("\nDelete Song:");
        playlist.deleteSong("Shape of You");

        System.out.println("\nUpdated Playlist:");
        playlist.displayPlaylist();
    }
}
