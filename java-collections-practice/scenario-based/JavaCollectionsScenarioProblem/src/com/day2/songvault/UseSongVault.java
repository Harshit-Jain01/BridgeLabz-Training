package com.day2.songvault;

public class UseSongVault {
	public static void main(String[] args) {
    SongVaultManager<Song> vault = new SongVaultManager<>();

    // sample folder path
    String songFolder = "src/samplefiles/songvault";

    try {
        vault.loadSongsFromFolder(songFolder);

        vault.showAllSongsSorted();
        vault.showSongsByGenre("Rock");
        vault.showUniqueArtists();

        // example filter
        vault.showLongSongs("5:00");

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}