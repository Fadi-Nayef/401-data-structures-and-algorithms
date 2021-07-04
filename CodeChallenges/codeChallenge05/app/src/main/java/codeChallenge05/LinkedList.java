package codeChallenge05;


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


    public void addToLast( int value) {
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
