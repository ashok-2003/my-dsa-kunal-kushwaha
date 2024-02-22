import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class que_stack_question_62 {
    /*
     so here we deal with the question of the ques and stack here like we have to make ques using the stack then how
     we can do that
     so for this definitely we have to use two stack as we enter the element in one stack directly and then add that
     that element into the another stack using the pop and push method here so it now act like the que here as
     if we add first then if we remove then first will be removed
    */


}
class MyQueue {
    // so now here we have to take care of the is empty so for that now we have to take the
    // size and array which act as the stack here so we will implement ques using it
    // as this is using the java default stack here so now worrres
    private Stack<Integer> first;
    private Stack<Integer> second;
    // so now we have created the two stack here


    public MyQueue() {
        // so now here we are intilazing the stack here
        first = new Stack<>();
        second = new Stack<>();
        // so now both are now initilazied
    }

    public void push(int x) {
        first.push(x);  // so it push in the first stack having complexicity constant
    }

    public int pop() {
        // so now for pop we have to use the second stack
        while(!first.isEmpty()){
            second.push(first.pop());
            // so now it inclue the item
            // so now updating the value in the first stack
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int peek() {
        // so now this return the peek elment same code of the remove but not removing
        while(!first.isEmpty()){
            second.push(first.pop());
            // so now it inclue the item
            // so now updating the value in the first stack
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
class MyStack {
    // so now in the stack last in first out happen and in stack opposite happen
    // as ques is of the linked list we can take nwo here also if we want to remove jsut remove and
    // store in the different one
    Queue<Integer> first;
    Queue<Integer> second;

    public MyStack() {
        // now intilazing both of it here so
        first = new LinkedList<>();
        second = new LinkedList<>();
    }

    public void push(int x) {
        // so now pushing it similary like we do int que
        first.add(x); // so element added in it
    }

    public int pop() {
        // so now for pop
        while( !first.isEmpty()){
            second.add(first.remove());
        }
        int removed = second.remove();
        // so now it removed so now updating the value
        while(!second.isEmpty()){
            first.add(second.remove());
        }
        return removed;
    }
    public int top() {
        // so now again it code work like the pop
        while( !first.isEmpty()){
            second.add(first.remove());
        }
        int tooped = second.peek();
        // so now it removed so now updating the value
        while(!second.isEmpty()){
            first.add(second.remove());
        }
        return tooped;
    }

    public boolean empty() {
        return first.isEmpty();
    }


}
