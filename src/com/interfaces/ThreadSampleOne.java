package com.interfaces;

class ThreadSampleOne extends Threads {
    public void run() {
        while (true) {
            System.out.println("my thread2 is running ");
            System.out.println("am totally not ok!!!");
        }
    }
}