/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void pushOntoStack(){
        Stack<java.io.Serializable> stack= new Stack<>();

        stack.push(10);
        assertEquals("10 --> Null",stack.toString());
    }
    @Test    public void pushMultipleStack(){
        Stack<java.io.Serializable> stack= new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals("30 --> 20 --> 10 --> Null",stack.toString());
    }

    @Test
    public void popStack(){
        Stack<java.io.Serializable> stack= new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();

        assertEquals("20 --> 10 --> Null",stack.toString());

    }

    @Test
    public void isEmptyStack(){
        Stack<java.io.Serializable> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void peekStack(){
        Stack<java.io.Serializable> stack= new Stack<>();

        assertEquals("Empty Stack.",stack.peek());
    }

    @Test
    public void instantiateEmptyStack(){
        Stack<java.io.Serializable> stack= new Stack<>();

        assertEquals(true,stack.isEmpty());
    }
    @Test
    public void callPeekOnEmptyStack(){
        Stack<java.io.Serializable> stack= new Stack<>();

        assertEquals("Empty Stack.",stack.peek());
    }

    @Test
    public void enqueueOntoQueue(){
        Queue<java.io.Serializable> queue= new Queue<>();

        queue.enqueue(10);
        assertEquals("10 --> Null",queue.toString());
    }

    @Test
    public void enqueueMultiple(){
        Queue<java.io.Serializable> queue= new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        assertEquals("10 --> 20 --> 30 --> Null",queue.toString());
    }

    @Test
    public void dequeueTest(){
        Queue<java.io.Serializable> queue= new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        assertEquals("20 --> 30 --> Null",queue.toString());
    }
    @Test
    public void peekIntoqueueTest(){
        Queue<java.io.Serializable> queue= new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.peek();
        assertEquals("10 --> 20 --> 30 --> Null",queue.toString());
    }
    @Test
    public void emptyQueueAfterMultTest(){
        Queue<java.io.Serializable> queue= new Queue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        assertEquals(true,queue.isEmpty());
    }
    @Test
    public void instantiateEmptyQueue(){
        Queue<java.io.Serializable> queue= new Queue<>();

        assertEquals(true,queue.isEmpty());
    }
    @Test
    public void callPeekOnEmptyQueue(){
        Queue<java.io.Serializable> queue= new Queue<>();

        assertEquals("Empty Queue.",queue.peek());
    }
}
