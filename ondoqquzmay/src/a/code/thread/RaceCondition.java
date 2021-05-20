package a.code.thread;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        CrowdControl crowdControl = new CrowdControl();
        Thread t1 = new Thread(() -> IntStream.range(1,100).forEach(i -> {
            try {
                crowdControl.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        Thread t2 = new Thread(() -> IntStream.range(1,120).forEach(i -> crowdControl.decrement()));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(crowdControl.getCurrentCount());
    }
}
