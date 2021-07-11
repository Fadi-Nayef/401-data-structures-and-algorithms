package stack.and.queue;

import java.util.NoSuchElementException;

public class PseudoQueue <T>  implements QueueInterface {
    Stack current;
     Stack temp;
     T value;

    public PseudoQueue(Stack current, Stack temp) {
        this.current = new Stack();
        this.temp = new Stack();
    }

    @Override
    public void enqueue(Object value) {
        current.push(value);
    }

    @Override
    public void dequeue() {
    reverse(current,temp);
    temp.pop();
    reverse(temp,current);
    }
    public void reverse(Stack current,Stack midStack){
        while (!midStack.isEmpty()){
            midStack.push(current.pop());
        }
    }

    public Stack getCurrent() {
        return current;
    }
}