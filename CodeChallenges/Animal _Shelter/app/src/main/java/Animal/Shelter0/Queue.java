package Animal.Shelter0;

public class Queue<T> {

    Node front;
    Node rear;
    public void enqueue(Animal value){
        Node node = new Node<>(value);

        if(front ==null){
            front=node;
        }else{
            rear.next=node;
        }
        rear=node;
    }

    public String dequeue(){
        if(front==null){
            return "Empty Queue.";
        }
        Node temp=front;
        front=front.next;
        temp.next=null;

        return temp.value.toString();
    }

    public String peek(){
        if (front==null){
            return "Empty Queue.";
        }
        return front.value.toString();
    }

    public boolean isEmpty(){
        return front==null;
    }

    @Override
    public String toString() {
        Node current = front;

        String values = "";

        while (current!=null){
            values+=current.value+" --> ";
            current=current.next;
        }
        values+="Null";
        return values;
    }
}
