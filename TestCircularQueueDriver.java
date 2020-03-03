/* 
Driver code for TestCircularQueue<T> class
*/

import ch04.queues.*;
import support.LLNode;

public class TestCircularQueueDriver {
   public static void main(String[] args ) {
   
      TestCircularQueue<Integer> myCircularQueue;
      myCircularQueue = new TestCircularQueue<Integer>();
   
      //add nodes to the queue
      myCircularQueue.enqueue(1);
      myCircularQueue.enqueue(2);
      myCircularQueue.enqueue(3);
      myCircularQueue.enqueue(4);
      myCircularQueue.enqueue(5); 
      
      //output toString
      System.out.println("\nThe current queue is: " + myCircularQueue);
      
      //output size
      System.out.println("\nThe current size of the queue is: " + myCircularQueue.size() );
      
      //remove method removes the front count elements from the queue
      System.out.println("\nRemoving the first element from queue: ");
      myCircularQueue.remove(1);
      System.out.println(myCircularQueue);
      
      //swapping the front 2 elements
      System.out.println("\nSwapping the front 2 elements: ");
      myCircularQueue.swapStart();
      System.out.println("The current queue is: " + myCircularQueue);
      
     //swapping the first and last elements
      System.out.println("\nSwapping the first and last elements" );
      myCircularQueue.swapEnds();
      System.out.println("The current queue is: " + myCircularQueue); 
       
   }
}