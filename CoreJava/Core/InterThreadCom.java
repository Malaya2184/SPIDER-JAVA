class Child extends Thread{
   public void run() {
    synchronized (this){
        System.out.println("thread start execution");
        this.notify();
        System.out.println("notif sent");
    }
   }
}
public class InterThreadCom {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        Child ch = new Child();
        ch.start();
        synchronized (ch){
            ch.wait();
            System.out.println("got notif");
        }
    }
}
