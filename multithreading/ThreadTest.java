package multithreading;

class Main extends Thread{

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}

class ThreadTest{
    public static void main(String args[]){
        Main thread = new Main();
        thread.start();
    }
}