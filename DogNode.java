/**
Test Driver for DogStack class

code used in this assignment was derived from the book, videos provided for this assignment and 
reading through the discussion board posts for this week 

*/

import ch02.stacks.*;

import support.LLNode;

public class DogNode<T> extends LinkedStack<T> {
   protected LLNode<T> top;
   protected int data;
   
   public DogNode() {
      top = null;
   }
   
   // Places element at the top of this stack.
   public void push(T element) {
      LLNode<T> newNode = new LLNode<T>(element);
      newNode.setLink(top);
      top = newNode;
   }

   //to String method to create and return a string that represents the current stack
   public String toString() {
      String result = "";
      if (top == null) {
         return "";
      }  
      LLNode<T> currNode = top;
         
      while(currNode != null) {
         result += currNode.getInfo() + ", ";
         currNode = currNode.getLink();
      }
      return result;
   }
   
   //method int size that returns the number of items currently on the stack
   public int size() {
      LLNode<T> currNode = top;
      int size = 0;
         while(currNode != null) {
            size += 1;
            currNode = currNode.getLink();
         }
      return size;
   }
   
   // method popSome removes top count elements from stack
   //throws StackUnderFlowException if there are less than count elements on stack
   public void popSome (int count) { 
      if(size() < 1 ) {
         throw new StackUnderflowException("Pop attempted on an empty stack.");
      } else { 
         for (int i = 0; i < count; i++) {
            top = top.getLink();
         }
      }
   }
   //method to reverse the order of the top 2 elements on the stack and returns true
   //if less than 2 elements, return false
   public boolean swapStart() {
      if(top == null){
         return false;
      } else { 
         LLNode<T> previous = top.getLink();
         top.setLink(top.getLink().getLink() );
         previous.setLink(top);
         top = previous; 
        
         return true;
      }       
   }
   
   //removes and returns the top element of the stack
   //if empty, throw exception
   public T poptop() {
      if (size() < 1 ) {
         throw new StackUnderflowException("Top attempted on an empty stack.");
      } else {
         LLNode<T> popped = top;
         top = top.getLink();
         return popped.getInfo();
      }
   }
}