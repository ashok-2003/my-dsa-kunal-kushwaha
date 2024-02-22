import java.util.*;

public class stack_59 {
    /* so now as we have learn earlier in recurion of the stack overflow that first step added then second added
     above it then 3rd added above it like that last one will be on the top of the container and will be pop
      out first

      first added will be removed out

      push mean added in the stack
      pop mean removed from the stack

      like now in the ques it works on the first in first out
      last in last out just simple */
    public static void main(String[] args) {
        // so here thier are some of the example here
        Stack<Integer> stack  = new Stack<>();
        stack.push(45);stack.push(56);stack.push(78);stack.push(88);
        // now for the removing we can do like stack pop
        System.out.println(stack.pop());  // pop function is function it also return as intiger which value it remove
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(".");

        //now we will talk about the quess so in the ques is basically the intefrence so it have some of the method
//        Queue<Integer> que = new Queue<Integer>(); // so this will give us the error as this is the intefrnce here
        Queue<Integer> que = new LinkedList<>();  // so now we can see this works as linked list extend to the various
        // function as we can see inside of it  these are the class shown

//        implements List<E>,Deque<E>, Cloneable, java.io.Serializable
        // now we can see also dques extend the quese as dques means doubly sided ques
//        public interface Deque<E> extends Queue<E>

        // so now adding and removing in the que
        que.add(56);
        que.add(78);
        que.add(89);
        que.add(34);
        que.add(232);
        // so now seeing inside of the ques how it done
        System.out.println(que.peek()); // so it just show us the peek element in the que
        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.peek());

        // so now we will learn about the deque so this mean double sided ques so in this their is a head and a tail
        // we can accese it form left and right both of the side and it is faster than linked list and stack both of it
        Deque<Integer> deque = new ArrayDeque<>();  // so it is of the type of arraydeque
        deque.add(45);
        deque.addLast(44);
        deque.addFirst(33);
        deque.removeFirst();  // so this is how different types of function can all work here
    }
}
