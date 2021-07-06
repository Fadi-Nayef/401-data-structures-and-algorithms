/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {

    }
    public void addLast(){
        var list= new LinkedList();

        list.addToLast(10);
        list.addToLast(20);
        list.addToLast(30);
    }

    @Test public void includesTest(){
        var list= new LinkedList();
        list.addToLast(10);
        list.addToLast(20);
        list.addToLast(30);

        list.addToFirst(40);
        list.addToFirst(50);
        list.addToFirst(60);

        assertTrue(list.includes(10),"Should return true");
        assertFalse(list.includes(90),"Should return false");
    }

    @Test public void firstTest(){
        var list= new LinkedList();
        list.addToLast(10);
        list.addToLast(20);
        list.addToLast(30);

        list.addToFirst(40);
        list.addToFirst(50);
        list.addToFirst(60);


        assertEquals(list.getFirst(), list.getFirst());

    }

    @Test
    public void toStringTest(){
        var list = new LinkedList();
        list.addToLast(10);
        list.addToLast(20);
        list.addToLast(30);

        list.addToFirst(40);
        list.addToFirst(50);
        list.addToFirst(60);

     assertEquals("List: { 60 } -> { 50 } -> { 40 } -> { 10 } -> { 20 } -> { 30 } -> NULL",list.toString());
    }

    @Test public void insertBeforeTest(){
        var list = new LinkedList();
        list.addToLast(10);
        list.addToLast(20);
        list.addToLast(30);

        list.addToFirst(40);
        list.addToFirst(50);
        list.addToFirst(60);

        list.insertBefore(10,5);
       assertEquals("List: { 60 } -> { 50 } -> { 40 } -> { 5 } -> { 10 } -> { 20 } -> { 30 } -> NULL",list.toString());

    }

    @Test public void insertAfterTest(){
        var list = new LinkedList();
        list.addToLast(10);
        list.addToLast(20);
        list.addToLast(30);

        list.addToFirst(40);
        list.addToFirst(50);
        list.addToFirst(60);

        list.insertAfter(10,5);
        assertEquals("List: { 60 } -> { 50 } -> { 40 } -> { 10 } -> { 5 } -> { 20 } -> { 30 } -> NULL",list.toString());

    }
    @Test
    public void kthEndTest(){
        var list = new LinkedList();
        list.kthEnd(6);
        list.kthEnd(20);
        list.kthEnd(-6);


    }

}
