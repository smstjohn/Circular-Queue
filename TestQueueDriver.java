/**
Test Driver for TestQueue<T> class
*/
import ch04.queues.*;
import support.LLNode;

public class TestQueueDriver {
   public static void main(String[] args ) {
   
      TestQueue<Integer> myQueue;
      myQueue = new TestQueue<Integer>();
   
      //add nodes to the queue
      myQueue.enqueue(1);
      myQueue.enqueue(2);
      myQueue.enqueue(3);
      myQueue.enqueue(4);
      myQueue.enqueue(5); 
   
      //output toString
      System.out.println("\nThe current queue is: " + myQueue);
      
      //output size
      System.out.println("\nThe current size of the queue is: " + myQueue.size() );
      
      //remove method removes the front count elements from the queue
      System.out.println("\nRemoving the first element from queue: ");
      myQueue.remove(1);
      System.out.println(myQueue);
      
      //swapping the front 2 elements
      System.out.println("\nSwapping the front 2 elements: ");
      myQueue.swapStart();
      System.out.println("The current queue is: " + myQueue);
      
      //swapping the first and last elements
      System.out.println("\nSwapping the first and last elements" );
      myQueue.swapEnds();
      System.out.println("The current queue is: " + myQueue);
       
   }
}