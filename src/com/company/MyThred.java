package com.company;

public class MyThred extends Thread{
    public MyThred (String name){
        super(name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! я поток " + getName());
            }
        } catch (InterruptedException err) {
            System.out.println("Когды пытались завершить, поток спал");
            return;

        }
     finally{
           System.out.printf("%s завершен\n", getName());
       }
    }
}
