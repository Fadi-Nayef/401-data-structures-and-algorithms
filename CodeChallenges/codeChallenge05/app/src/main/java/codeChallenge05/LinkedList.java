package codeChallenge05;


import java.util.ArrayList;

public class LinkedList {

    private class Node {

        private Integer value;
        private Node next;


        public Node(int value) {
            this.value = value;

        }

        public String toString() {
            return "[" + this.value + "]";
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }
    private Node first ;
    private Node last ;


    public LinkedList zipLists(LinkedList b){
        int length = 0 ;
        Node current = first;
        if(this.isEmpty())return b;
        if(b.isEmpty()) return this;
        zipLists(this.first,b.first);
        return this;
    }
    private void zipLists(Node a, Node b){
        int length=0;
        Node current = a.next;

        Node firstList = a.next;
        Node secondList = b.next;
        if(firstList == null) return;
        if(secondList == null) return;

          a.next = b;
          b.next = firstList;
        zipLists(firstList,secondList);
    }

    public void kthEnd(int k) {
        var node = new Node(k);
        int length = 0;
        Node current = first;

        if (k < 0) {
            System.out.println("Exception");
        } else {
            for (int i = 0; current != last; i++) {
                current = current.next;
                length++;
            }
            current = first;

            int i = 1;
            if (k < length) {
                //-k+1 to start indexing bkwrd
                while (i < length - k + 1) {
                    current = current.next;
                    i++;
                }
                System.out.println(current.value);
            } else {
                System.out.println("Exception");
            }

        }
    }



    public Node getFirst() {
        return first;
    }

    public void addToLast(int value) {
        var node = new Node(value);

        if(first==null)
            first=last=node;
        else{
            last.next=node;
            last = node;
        }
    }

    public void append(int value) {
        var node = new Node(value);

        if(first==null)
            first=last=node;
        else{
            last.next=node;
            last = node;
        }
    }
    public void insertBefore(int value , int newValue ){
        var current = first;
        var node = new Node(newValue);

        while( current.next != null )
        {
            if( current.next.value == value )
            {
                node.next = current.next;
                current.next = node;
                return;
            }

            current = current.next;
        }

    }
    public void insertAfter(int value , int newValue ){
        var current = first;
        var node = new Node(newValue);

        while( current.next != null )
        {
            if( current.value == value )
            {
                node.next = current.next;
                current.next = node;
                return;
            }

            current = current.next;
        }

    }


    public void addToFirst (int data){
        var node = new Node(data);
        if (isEmpty())
            first=last=node;
        else{
            node.next=first;
            first = node;
        }

    }

    public int indexOf(int data){
        int idx = 0 ;
        var current = first;
        while (current != null ){
            if (current.value == data ) return  idx ;
            current = current.next;
            idx++;
        }
        return -1;
    }

    public boolean includes( int data){
        return indexOf(data) != -1;
    }

    public String toString() {
        String result = "";
       var current = first;
        while(current != null){


                result += "{ "+current.value+" } -> ";
                current = current.next;



        }
        result=result+"NULL";
        return "List: " + result ;
    }


    private boolean isEmpty(){ return first == null ;}

}
