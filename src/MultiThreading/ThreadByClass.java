package MultiThreading;

public class ThreadByClass {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("Worker");
        worker w1 = new worker(threadGroup, "W1");
        w1.start();

        worker w2 = new worker(threadGroup, "W2");
        w2.start();

        for(int i = 0; i < 5; i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class worker extends Thread{

    worker(ThreadGroup threadGroup, String name){
        super(threadGroup, name);
    }
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
