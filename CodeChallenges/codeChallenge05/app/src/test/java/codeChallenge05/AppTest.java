/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

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
    @Test public void appendTest(){
        var list= new LinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        assertEquals("List: { 10 } -> { 20 } -> { 30 } -> NULL",list.toString());
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

    @Test
    public void zipTwoListTest(){
        var list = new LinkedList();
        var list2 = new LinkedList();
        list2.addToFirst(22);
        list2.addToFirst(22);
        list2.addToFirst(22);
        list2.addToFirst(22);
        list2.addToFirst(23);


        //add item to the list
        list.addToLast(10);
        list.addToLast(20);
        list.addToLast(30);
        // add item to the head
        list.addToFirst(40);
        list.addToFirst(50);
        list.addToFirst(60);

        Assertions.assertEquals("List: { 60 } -> { 23 } -> { 50 } -> { 22 } -> { 40 } -> { 22 } -> { 10 } -> { 22 } -> { 20 } -> { 30 } -> NULL",list.zipLists(list2).toString());
    }
}
