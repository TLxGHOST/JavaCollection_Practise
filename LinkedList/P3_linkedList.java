
import java.util.LinkedList;

// Implement a Stack using the LinkedList class.
public class P3 {
  public static void main(String[] args) {
    LinkedList<Integer> stack = new LinkedList<>();
    // Since stack usses LIFO
    // we just use the function offerFirst() ; pollFirst() or push() pop() that way
    // it will behave
    // like stack
    // similarly we have Stack class that inheits vector class and is thread safe
    // Stack<Integer> stck=new Stack<>();
    stack.push(1);
    stack.pop();

  }
}
