package Trees;

public class Trees {
        //Tree (root)
        //Node (value,leftChild,rightChild)
    public class Node{
        private int  value;
        private Node leftChild;
        private Node rightChild;

        public Node(int val){
            this.value=val;
        }

        @Override
        public String toString(){
            return "Node = "+value;
        }

        }
//Tree class from here
    private Node root;
    public void insert(int val){
        if(root==null){
            root=new Node(val);
            return;
        }
        var current=root;
        while (true){
            //one for leftChild
            //another for rightChild
            if(current.value>val){
                if(current.leftChild==null){
                    current.leftChild=new Node(val);
                    //usage of constructor
                    break;
                }
                current=current.leftChild;
            }
            else {
                if(current.rightChild==null){
                    current.rightChild=new Node(val);
                    break;
                }
                current=current.rightChild;
            }
        }
    }



    /*  find(value):boolean
    * var current=root starts from root
    * current=current.leftChild if root val big
    * else current=current.rightChild
    * return true if exist
    * */

    public boolean find(int val){
        var current=root;
        if(current==null)
            return false;
        while (current!=null){
            if(val<current.value)
                current=current.leftChild;
            else if (val >current.value)
                current=current.rightChild;
            else {
                return true;
            }
        }
        return false;
    }

    // traversing tree
    // breadth first and depth first traversal
    /*
                8
              /   \
             4     12
            / \    /  \
           2   6  10   14
         */
    //breadth first => level by level 8 4 12 26 10 14
    //depth first =>/* 3ways
    //pre-order : root ,left ,right      *left first
    // * in-order  : left ,root, right   *will show sorted
    //post-order: left, right, root      *leaf first


    // */
    public  void  preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        // root print =>then left=>then right
        if(root==null)
            return;
        System.out.println(root.value);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.leftChild);
        System.out.println(root.value);
        inOrder(root.rightChild);

    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.println(root.value);
    }

    public static void main(String[] arg){
    }
}
