package dev.venketesh.firstmultithreadedprogram;

public class FirstMultiThreadedProgram {
    public static void main(String[] args) {
        SayHi sayHi = new SayHi();
        PrintNumbers printNumbers = new PrintNumbers();

        Thread t1 = new Thread(sayHi);
        Thread t2 = new Thread(printNumbers);

        t1.start(); //Print hello world using a single thread
        t2.start(); //Print 1-100 using a single thread

        for (int i = 0; i <= 100; i++) {
            PrintSingleNumber printSingleNumber = new PrintSingleNumber(i);
            Thread t = new Thread(printSingleNumber);
            t.start();
        } //Print 1-100 using 100 different threads
    }
}
