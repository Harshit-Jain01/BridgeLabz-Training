package com.javastreams.pipedstream;


import java.io.IOException;
import java.io.PipedOutputStream;

class WriterThread extends Thread {

    private PipedOutputStream out;

    public WriterThread(PipedOutputStream out) {
        this.out = out;
    }

    @Override
    public void run() {
        try {
            String message = "from Writer Thread";
            out.write(message.getBytes());
            out.close(); 
        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}
