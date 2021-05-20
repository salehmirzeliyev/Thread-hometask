package Thread;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        new MYThread().start();

        //Thread myThread = new Thread(new MYThread());
//        //*
//        Thread myThread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        });
        //*

        //*
//        Thread myThread = new Thread(() ->IntStream.range(1,100).forEach(System.out::println));
//        Thread myThread2 = new Thread(() ->IntStream.range(1,100).forEach(System.out::println));
//        myThread.start();
//        myThread2.start();
//        myThread.join();
//        myThread2.join();
//        System.out.println("after started");
//        //*

       Thread myThread2 = new Thread(() -> {
           while (true) {
           //while (!Thread.interrupted() ) {
               System.out.println("444");
           }
       });
       myThread2.start();
       Thread.sleep(100);
      // myThread2.interrupt();
       myThread2.stop();
       myThread2.join();
        System.out.println("after thread");
    }
       }

