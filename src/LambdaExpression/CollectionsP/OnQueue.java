package LambdaExpression.CollectionsP;

import java.util.PriorityQueue;
import java.util.Queue;

public class OnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>((a, b)-> b - a);
        q.add(10);
        q.add(101);
        q.add(14);
        q.add(56);
        q.add(80);
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}
