package geeksforgeeks;
/*Binary tree operations */
  /*                                                          ---------------------
                                                            | left | data=1 |right|
                                                            ---------------------|
                                                             |                    |
                                     -----------------------|                      |-----------------------------
                                     | left | data | right |                        | left     | data | right   |
                                     -----------------------                        -----------------------------
                                                                                            |               |
                                                                    -----------------------|                 |------------------------
                                                                    | left | data | right |                    | left | data | right |
                                                                    |----------------------                    -----------------------
                                                                    |                   |
                                           -----------------------|                      |-----------------------
                                           | left | data | right |                        | left | data | right |
                                           -----------------------                        -----------------------*/
public class BinaryTree {
static class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }
}
static class BinaryT{
   static int idx=-1;
    public Node buildTree(int val[]){
        idx++;
        if (val[idx]==-1){
            return null;
        }
        Node newNode=new Node(val[idx]);
        newNode.left=buildTree(val);
        newNode.right=buildTree(val);
        return newNode;
    }
}

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryT tree=new BinaryT();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);

    }

}
