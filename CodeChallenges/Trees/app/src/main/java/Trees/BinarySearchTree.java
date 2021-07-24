package Trees;

public class BinarySearchTree {
    Node root;

    public void add(int key){
        if (root == null) {
            root = new Node(key);

        }else{
            Node current = root;
            addTraverse(current,key);

            //Here We Can Add each right and left alone
//            traverseRight(current,key);
//            traverseLeft(current,key);

        }
    }

    public boolean containsNode(int key) {
        Node current= root;
        return containsNodeRecursive(current, key);
    }

    private boolean containsNodeRecursive(Node current, int key) {
        if (current == null) {
            return false;
        }
        if (key == current.getKey()) {
            return true;
        }
        // find the value between roots
        return key < current.getKey()
                ? containsNodeRecursive(current.getLeft(), key)
                : containsNodeRecursive(current.getRight(), key);
    }


    private void addTraverse(Node current, int key){
        if (key> current.getKey()){
            if(current.getRight() == null ){
                current.setRight(new Node (key));
                return;
            }
            current = current.getRight();

        }else{
            if(current.getLeft()==null){
                current.setLeft(new Node(key));
                return;
            }
            current = current.getLeft();
        }
        addTraverse(current,key);
    }


}
