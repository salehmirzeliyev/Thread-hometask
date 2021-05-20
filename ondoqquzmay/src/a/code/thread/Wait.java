package a.code.thread;

public class Wait {
    int currentCount = 0;

    public void increment() throws InterruptedException {
        currentCount++;
        System.out.println("notify");
        notify();
    }

    public void decrement() {
        if (currentCount <= 0) {
            System.out.println("wait");
            currentCount--;
        }
    }

    public int getCurrentCount(){
        return this.currentCount;
    }
}
