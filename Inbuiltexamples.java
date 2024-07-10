package Stacks_Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Inbuiltexamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(78);
//        stack.push(6);
//        stack.push(88);
//        stack.push(90);
//        stack.push(12);
//
//
//        //poping all the elements from stack
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(7);
        queue.add(55);
        queue.add(66);

        System.out.println(queue.remove());


    }
}
