package multithreading;

class SharedResources{
    private int value = 0;
    private final Object lock = new Object();
    public synchronized void increment(){
        value++;

        synchronized (lock){
//        this is a syncronized block
        }
    }
    public synchronized int getValue() {
        return value;
    }
}

class MyRunnable implements Runnable{
    public void run(){
        SharedResources obj = new SharedResources();
        for(int i=0; i<10; i++){
            obj.increment();
            System.out.println(obj.getValue());
        }
    }
}

public class RunThread {
    public static void main(String args[]){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
