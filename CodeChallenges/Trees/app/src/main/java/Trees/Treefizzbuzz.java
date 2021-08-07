package Trees;

import java.util.ArrayList;

public class Treefizzbuzz {


    static void inorder(KTreeNode node){
        if (node == null){ return;}

        int total = node.child.length;

        for (int i = 0; i < total - 1; i++)
            inorder(node.child[i]);
        if ( node.data% 15==0){
            System.out.println(node.data+" FizzBuzz");

        }else if(node.data%5==0) {
            System.out.println( node.data+" Buzz");

        }else if(node.data%3==0){
            System.out.println(node.data+" Fizz");

        }else{
            System.out.println("unable to be divided by 3 or 5  "+node.data );

        }
        inorder(node.child[total - 1]);
    }


    public static void main(String[] args){
        int n = 3;
        KTreeNode root = new KTreeNode(n, 3);
        root.child[0] = new KTreeNode(n, 2);
        root.child[1] = new KTreeNode(n, 3);
        root.child[2] = new KTreeNode(n, 4);
        root.child[0].child[0] = new KTreeNode(n, 5);
        root.child[0].child[1] = new KTreeNode(n, 6);
        root.child[0].child[2] = new KTreeNode(n, 15);

        inorder(root);
    }
}
