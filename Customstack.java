package Stacks_Queues;

public class Customstack {
    public static void main(String[] args) {

    }
    int ptr = -1;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public Customstack(){                        // if the size is  not given
        this(DEFAULT_SIZE);
    }

    public Customstack(int size){               // if the stack size is given
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is empty");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
       }

       public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException ("Cannot pop from an empty stack");
        }
//        int removed = data[ptr];
//        ptr --;
//        return removed;
           return data[ptr--];
       }
       public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
       }
        private boolean isFull() {
            return ptr == data.length - 1;
        }
        private boolean isEmpty() {
            return ptr == -1;
        }

}
