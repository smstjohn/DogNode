/**
Test Driver for DogStack class

code used in this assignment was derived from the book, videos provided for this assignment and 
reading through the discussion board posts for this week 

*/
import ch02.stacks.*;

import support.LLNode;


public class DogNodeDriverClass {
   public static void main(String[] args ) {
   
      DogNode<Integer> testStack;
      testStack = new DogNode<Integer>();

      //add nodes to the stack
      testStack.push(1);
      testStack.push(2);
      testStack.push(3);
      testStack.push(4);
      testStack.push(5);

      //output toString
      System.out.println(testStack);
         
      //output size
      System.out.println(testStack.size() );
         
      //popSome popping 2 elements from the top of the stack
      testStack.popSome(2);
      System.out.println(testStack);
         
      //swapStart swapping the top most element with the 2nd top most element
      testStack.swapStart();
      System.out.println(testStack);      
         
      //poptop popping the current top most element
      int poppedTop = testStack.poptop();
      System.out.println("The popped integer: " + poppedTop);
      System.out.println(testStack);
   }
}