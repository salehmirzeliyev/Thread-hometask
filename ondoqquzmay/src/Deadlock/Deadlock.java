package Deadlock;

public class Deadlock {
    private  static Object lock1 = new Object();
    private  static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> meth1().start());
        new Thread(() -> meth2().start());
    }

    public static void meth1(){
        synchronized (lock1){
            System.out.println("ins meth1 - lock1");
            synchronized (lock2){
                System.out.println("ins met1 - lock2");
            }
        }
    }

    public static void meth2(){
        synchronized (lock2){
            System.out.println("ins meth2 - lock2");
            synchronized (lock2){
                System.out.println("ins met2 - lock1");
            }
        }
    }
}
