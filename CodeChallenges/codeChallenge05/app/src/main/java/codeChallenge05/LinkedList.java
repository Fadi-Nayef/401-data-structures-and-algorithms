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


    public void addToLast( int data) {
        var node = new Node(data);

        if(first==null)
            first=last=node;
        else{
            last.next=node;
            last = node;
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
