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

        /*
        *
        * */
    public static void main(String[] arg){
    }
}
