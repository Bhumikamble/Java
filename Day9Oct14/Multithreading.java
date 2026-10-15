package Day9Oct14;

public class Multithreading extends Thread {
    
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args){

        Multithreading obj=new Multithreading();
        obj.start();
    }
}
