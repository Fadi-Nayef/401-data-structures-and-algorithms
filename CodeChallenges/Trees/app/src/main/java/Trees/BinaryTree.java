package Trees;

import java.util.ArrayList;

public class BinaryTree {
    Node root;
    public ArrayList<Integer> inOrder= new ArrayList<>();
    public ArrayList<Integer> postOrder= new ArrayList<>();
    public ArrayList<Integer> preOrder= new ArrayList<>();

    public void inOrderTraverse(Node node){
        if (node != null){
            inOrderTraverse(node.getLeft()); // traverse left sub tree
            System.out.print(" "+ node.getKey()); // root
            inOrder.add(node.getKey());
            inOrderTraverse(node.getRight()); // traverse right sub tree

        }
    }
    public ArrayList<Integer> getInOrder() {
        return inOrder;
    }


    public void postOrderTraverse(Node node){
        if (node != null){
            postOrderTraverse(node.getLeft()); // traverse left sub tree
            postOrderTraverse(node.getRight()); // traverse right sub tree
            System.out.print(" "+ node.getKey()); // root
            postOrder.add(node.getKey());
        }
    }
    public ArrayList<Integer> getPostOrder() {
        return postOrder;
    }


    public void preOrderTraverse(Node node){
        if (node != null){
            System.out.print(" "+ node.getKey()); // root
            preOrder.add(node.getKey());
            preOrderTraverse(node.getLeft()); // traverse left sub tree
            preOrderTraverse(node.getRight()); // traverse right sub tree
        }
    }


    public ArrayList<Integer> getPreOrder() {
        return preOrder;
    }
    public void setRoot(Node root) {
        this.root = root;
    }



    public Node getRoot() {
        return root;
    }




}
