package com.company;

import java.util.ArrayList;
import java.util.Collection;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        Collection<Thread> threads= new ArrayList<>(4);

        for (int i = 0; i < 4; i++) {
           threads.add (new MyThred("#" + (i + 1)));
        }
         for (Thread thread: threads) {
         thread.start();
         }
        Thread.sleep(15000);

         for (Thread thread: threads){
             thread.interrupt();
         }
    }
}