package dev.venketesh.firstmultithreadedprogram;

public class PrintSingleNumber implements Runnable {
    int numberToPrint;

    public PrintSingleNumber(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint);
    }
}
