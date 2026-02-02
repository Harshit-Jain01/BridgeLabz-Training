package com.interfaces.marker.databackup;

public class BackupService {

    static void backup(Object obj) {

        if (obj instanceof Backupable) {
            System.out.println("Object backed up successfully");
        } else {
            System.out.println("Backup not allowed");
        }
    }
}