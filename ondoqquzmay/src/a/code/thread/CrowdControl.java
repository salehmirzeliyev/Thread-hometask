package a.code.thread;

public class CrowdControl {
    int currentCount = 0;

    public void increment() throws InterruptedException {
        System.out.println("start inc");
        synchronized (this) { //ancaq sync icindeki emelyat blok olar
            currentCount++;
        }
        Thread.sleep(1000);
        System.out.println("stop inc");
    }

    public synchronized void decrement(){ //butun metod blook olacaq
        currentCount--;
    }
    public int getCurrentCount(){
        return this.currentCount;
    }
}
