package j.collections;


import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();

        //method 1 peek()
        System.out.println(q.peek());// null

        //method 2 element
//        System.out.println(q.element());//NoSuchElementException

        for (int i=0;i<=10;i++){
            //method 3 offer()
            q.offer(i);
        }

        System.out.println(q);

        //method 4 poll() - remove head element and return
        System.out.println(q.poll()); // 0
        System.out.println(q);



    }
}
