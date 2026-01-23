package com.javastreams.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;

class ReaderThread extends Thread {

    private PipedInputStream in;

    public ReaderThread(PipedInputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}
