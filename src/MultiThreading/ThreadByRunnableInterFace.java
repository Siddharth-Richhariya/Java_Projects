package MultiThreading;

public class ThreadByRunnableInterFace {
    public static void main(String[] args) throws InterruptedException {
        Runnable W1 = new worker1();
        Thread t1 = new Thread(W1);
        t1.start();

        Runnable W2 = new worker1();
        Thread t2 = new Thread(W2);
        t2.start();

        for (int i =0; i < 5; i++){
            System.out.println(i +" --> "+Thread.currentThread().getName());
            Thread.sleep(2000);
        }
    }
}
class worker1 implements Runnable{

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                System.out.println(i +" --> "+Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}