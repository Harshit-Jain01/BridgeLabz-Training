package com.interfaces.marker.databackup;

public class UseBackupdata {
	public static void main(String[] args) {

        UserData user = new UserData("Anvi", 23);
        TempData temp = new TempData("Session cache");

        BackupService.backup(user); 
        BackupService.backup(temp); 
    }
}
