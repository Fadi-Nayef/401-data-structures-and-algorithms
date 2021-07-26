package Trees;

import java.util.ArrayList;

public class BinaryTree {
    Node root;
    public ArrayList<Integer> inOrder= new ArrayList<>();
    public ArrayList<Integer> postOrder= new ArrayList<>();
    public ArrayList<Integer> preOrder= new ArrayList<>();
    public ArrayList<Integer> levelOrder = new ArrayList<>();

    public void breadthFirst(){
        int h = height(root);
        int i;
        for (i=1; i<=h; i++){printCurrentLevel(root, i);}
    }

    public int height(Node root){
        if (root == null){ return 0;}
        else{
            int leftH = height(root.getLeft());
            int rightH = height(root.getRight());

            if (leftH > rightH){return(leftH+1);}
            else return(rightH+1);
        }
    }

    public void printCurrentLevel (Node root ,int level){
        if (root == null){return;}
        if (level == 1) {
            levelOrder.add(root.getKey());
            System.out.println(levelOrder);
        }
        else if (level > 1){
            printCurrentLevel(root.getLeft(), level-1);
            printCurrentLevel(root.getRight(), level-1);

        }}

    public int maxNode (Node node){
        if(node != null) {
        int nodeComp= node.getKey();
        int maxLeft = maxNode(node.getLeft());
        int maxRight= maxNode(node.getRight());
        if (maxLeft > nodeComp){
            nodeComp=maxLeft;
        } if (nodeComp < maxRight){
            nodeComp = maxRight;

        }
            return nodeComp;
        }

        return -1;
    }


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
