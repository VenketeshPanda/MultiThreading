package dev.venketesh.firstmultithreadedprogram;

public class SayHi implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
