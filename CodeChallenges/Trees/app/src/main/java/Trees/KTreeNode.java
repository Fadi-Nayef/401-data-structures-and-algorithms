package Trees;


public class KTreeNode {
    public KTreeNode[] child;
     int data;
    public KTreeNode (int n, int data){
        child = new KTreeNode[n];
        this.data = data;
    }
}
