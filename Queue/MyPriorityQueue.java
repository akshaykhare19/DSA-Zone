import java.util.*;

public class MyPriorityQueue
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(80);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }

    }
}