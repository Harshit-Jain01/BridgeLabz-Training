package com.javastreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream{

    public static void main(String[] args) {

        String filePath = "src/com/javastreams/data.ser";
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(filePath))) {

            int rollNo = 101;
            String name = "Harsh";
            double gpa = 8.75;

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data from binary file 
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(filePath))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No : " + rollNo);
            System.out.println("Name    : " + name);
            System.out.println("GPA     : " + gpa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
