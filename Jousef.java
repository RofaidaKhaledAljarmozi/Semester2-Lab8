public class Jousef {
//    public class Josephus { 2 /** Computes the winner of the Josephus problem using a circular queue. */
//            3 public static <E> E Josephus(CircularQueue<E> queue, int k) { 4 if (queue.isEmpty( )) return null;
//        5 while (queue.size( ) > 1) { 6 for (int i=0; i < k−1; i++) // skip past k-1 elements
//            7 queue.rotate( );
//            8 E e = queue.dequeue( ); // remove the front element from the collection
//            9 System.out.println(" " + e + " is out");
//            10 } 11 return queue.dequeue( ); // the winner
//        12 } 13
//            14 /** Builds a circular queue from an array of objects. */
//            15 public static <E> CircularQueue<E> buildQueue(E a[ ]) { 16 CircularQueue<E> queue = new LinkedCircularQueue<>( );
//        17 for (int i=0; i<a.length; i++)
//            18 queue.enqueue(a[i]);
//        19 return queue;
//        20 } 21
//            22 /** Tester method */
//            23 public static void main(String[ ] args) { 24 String[ ] a1 = {"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
//        25 String[ ] a2 = {"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
//        26 String[ ] a3 = {"Mike", "Roberto"};
//        27 System.out.println("First winner is " + Josephus(buildQueue(a1), 3));
//        28 System.out.println("Second winner is " + Josephus(buildQueue(a2), 10));
//        29 System.out.println("Third winner is " + Josephus(buildQueue(a3), 7));
//        30 } 31 }
}
