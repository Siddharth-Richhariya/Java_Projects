package MultiThreading;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.println(t);
        for(int i = 0; i < 5 ; i++){
            System.out.println(i + " - "+ t.getName());
            System.out.println(i + " - "+ t.getPriority());
            Thread.sleep(2000);
        }
    }
}
/*Output
Thread[#1,main,5,main]
0 - main
0 - 5
1 - main
1 - 5
2 - main
2 - 5
3 - main
3 - 5
4 - main
4 - 5
 */