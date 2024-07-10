package Stacks_Queues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        Customstack stack = new Customstack(20);
        stack.push(45);
        stack.push(4);
        stack.push(46);
        stack.push(488);
        stack.push(40);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());

    }
}
