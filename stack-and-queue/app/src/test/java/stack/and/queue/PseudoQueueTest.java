package stack.and.queue;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PseudoQueueTest {
    public void pseudoQueueTest() {
        var current = new Stack<>();
        var temp = new Stack<>();
        var pseudoQT = new PseudoQueue<>(current, temp);
        pseudoQT.enqueue(50);
        pseudoQT.enqueue(40);
        pseudoQT.enqueue(30);
        pseudoQT.enqueue(20);
        pseudoQT.enqueue(10);
        pseudoQT.dequeue();
        String actual = pseudoQT.getCurrent().toString();
        assertEquals("10 --> 20 --> 30 --> 40 --> 50 --> Null", actual);
    }

    @Test
    public void pseudoDequeueTest() {
       var current = new Stack<>();
       var temp = new Stack<>();
        PseudoQueue<Object> pseudoQT = new PseudoQueue<>(current, temp);
        pseudoQT.enqueue(40);
        pseudoQT.enqueue(30);
        pseudoQT.enqueue(20);
        pseudoQT.dequeue();
        String result = pseudoQT.getCurrent().toString();
        assertEquals("10 --> 20 --> 30 --> Null", result);
    }
    @Test
    public void errorTest(){
        var current = new Stack<>();
        var temp = new Stack<>();
       var pseudoQT = new PseudoQueue<>(current, temp);
        assertEquals("te",pseudoQT.getCurrent().toString());
    }

}
