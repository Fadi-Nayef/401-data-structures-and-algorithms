/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

@Test
public void breadthFirstTest(){
    BinaryTree binaryTree= new BinaryTree();

    //Adding nodes to the tree
    binaryTree.setRoot(new Node(30));
    binaryTree.getRoot().setLeft(new Node(40));
    binaryTree.getRoot().setRight(new Node(150));
    binaryTree.getRoot().getLeft().setLeft(new Node(60));
    binaryTree.getRoot().getRight().setRight(new Node(100));


    binaryTree.breadthFirst();
    assertEquals("[30, 40, 150, 60, 100]",binaryTree.levelOrder+"");

}
    @Test
    public void maxTest(){
        BinaryTree binaryTree= new BinaryTree();

        binaryTree.setRoot(new Node(20));

        binaryTree.getRoot().setLeft(new Node(30));
        binaryTree.getRoot().setLeft(new Node(90));
        binaryTree.getRoot().setRight(new Node(40));
        binaryTree.getRoot().setRight(new Node(50));
        binaryTree.getRoot().setRight(new Node(70));

        binaryTree.preOrderTraverse(binaryTree.getRoot());

        assertEquals(90,binaryTree.maxNode(binaryTree.getRoot()));

    }
    @Test
    public void emptyTree(){
        BinaryTree binaryTree= new BinaryTree();
        assertNull(binaryTree.getRoot());
    }

    @Test
    public void singleRoot(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(10));
        assertEquals(10, binaryTree.getRoot().getKey());
    }

    @Test
    public void addChild(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(40));

        binaryTree.getRoot().setLeft(new Node(50));
        binaryTree.getRoot().setRight(new Node(60));

        assertEquals(50, binaryTree.getRoot().getLeft().getKey());
        assertEquals(60, binaryTree.getRoot().getRight().getKey());
    }

    @Test
    public void preOrder(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(20));

        binaryTree.getRoot().setLeft(new Node(30));
        binaryTree.getRoot().setRight(new Node(40));

        binaryTree.preOrderTraverse(binaryTree.getRoot());

        assertEquals("[20, 30, 40]",binaryTree.getPreOrder()+"");

    }

    @Test
    public void inOrder(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(30));

        binaryTree.getRoot().setLeft(new Node(40));
        binaryTree.getRoot().setRight(new Node(50));

        binaryTree.inOrderTraverse(binaryTree.getRoot());

        assertEquals("[40, 30, 50]",binaryTree.getInOrder()+"");

    }

    @Test
    public void postOrder(){
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.setRoot(new Node(30));

        binaryTree.getRoot().setLeft(new Node(40));
        binaryTree.getRoot().setRight(new Node(50));

        binaryTree.postOrderTraverse(binaryTree.getRoot());

        assertEquals("[50, 40, 30]",binaryTree.getPostOrder()+"");

    }
    }

