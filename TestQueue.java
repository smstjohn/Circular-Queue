import ch04.queues.*;
import support.LLNode;

public class TestQueue<T> extends LinkedQueue<T> { 

   //to String method to create and return a string that represents the current queue
   public String toString() {
      String result = "";
      if (isEmpty()) {
         return "Queue is empty.";
      }  
      LLNode<T> currNode = front;
         
      while(currNode != null) {
         result += currNode.getInfo().toString() + ", ";
         currNode = currNode.getLink();
      }
      return result;
   }
   
   //remove method removes the front count elements from the queue, 
   //throws exception if less than count elements are in queue
   public void remove(int count) throws QueueUnderflowException{
    if (size() < count){
      throw new QueueUnderflowException("Can't remove on an empty queue.");
    } else {
      // remove count number of elements from front
      for(int i=1; i<=count; i++)
         dequeue();
      }
   }
   
   //returns false if less than 2 elements are in the queue, 
   //otherwise reverses order of the front 2 elements in the queue and returns true
   public boolean swapStart() {
      if (size() < 2) {
         return false;
      } else {
         // swapping data of first two elements
         LLNode<T> previous = front.getLink();
         front.setLink(front.getLink().getLink() );
         previous.setLink(front);
         front = previous; 
         
         return true;
      }
   }
   
   //returns false if there are less than 2 elements in the queue
   //otherwise swaps the first and last elements of queue and return true
   public boolean swapEnds() {
      if (size() < 2) {
         return false;
      } else {
         LLNode<T> currNode = front;
         LLNode<T> prevNode = null;
         
         //go through the list to find the next to last node
         while(currNode.getLink() != null) {
            prevNode = currNode;
            currNode = currNode.getLink();
         }
         //set rear node as new front node and front node as new rear node
         rear.setLink(front.getLink());
         prevNode.setLink(front);
         front = rear;
         rear = prevNode.getLink();
         rear.setLink(null);
         
         return true;         
      } 
   }
}