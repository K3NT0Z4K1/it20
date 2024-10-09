
package topic_3_stack;

/**
 *
 * @author kent ryan pagongpong
 */


public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }
    
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; 
        }
        return stackArray[top];
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

}