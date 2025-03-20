package Trees;

import java.util.ArrayList;

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


    //  Depth first traversals
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

    /*
    * For heigh of a tree we can use
    * 1+max(height(L),height(R)) ==>recursive shits
    * post order used to calculate height
    * since post order starts from leaves
    *
    * */

    public int height(){

        return height(root);
    }
    private int height(Node root){
        if(root==null)
            return -1;

        if( root.leftChild == null && root.rightChild==null)
            return 0;
        return 1+Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    private boolean isLeaf (Node root){
        return root.leftChild == null && root.rightChild==null;
    }

    //in BST leftmost leaf is the min
    public int min2(){
        return min2(root); //O(logN)
    }
    private int min2(Node root){
        if(root== null)
            throw new IllegalStateException();

        var current=root;
        var last=current;
        while (current!=null){
            last=current;
            current=current.leftChild;
        }
        return last.value;
    }

    //basically this is for bin tree
    public int min(){
        return min(root);
    }
    private int min (Node root){
        //gotta use postOrder from leaves to root
        if(isLeaf(root))
            return root.value;
        var left=min(root.leftChild);
        var right=min(root.rightChild);

        return Math.min(Math.min(left,right),root.value);

    }


    public ArrayList<Integer> nodeAtDistance(int dist){
        var list=new ArrayList<Integer>();
        nodeAtDistance(root,dist,list);
        return list;
    }
    private void nodeAtDistance(Node root,int dist,ArrayList<Integer> list ){
        if(root==null)
            return;
        if(dist==0){
            list.add(root.value);
            return;
        }
        //mainly setting up a limiter to stop
        nodeAtDistance(root.leftChild,dist-1,list);
        nodeAtDistance(root.rightChild,dist-1,list);
    }


    //Depth first or Level order traversals
    public void levelOrder(){
        for(var i=0;i<=height();i++){
            var list=nodeAtDistance(i);
            System.out.println(list.toString());
        }
    }

    public static void main(String[] arg){
    }
}
