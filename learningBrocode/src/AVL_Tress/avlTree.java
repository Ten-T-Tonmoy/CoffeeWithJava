package AVL_Tress;
//Self Balancing BSTree to avoid skewness or unbalance
//Adelson-Velsky and Landis tree
// also Red-black tree, B-trees,2-3 trees are self balancing



/**
 * main mechanism is to rotate
 * if height(left)-height(right)<=1 then they rotate
 * LL left rotation
 * RR right rotation
 * LR left-right rotation
 * Rl right-left rotation
 *
 * */
public class avlTree {
    private class avlNode{
        private int val;
        private avlNode leftChild;
        private avlNode rightChild;

        public avlNode(int value){
            this.val=value;
        }

        //overRide keyword does shits fr
        @Override
        public String toSring(){
            return "Value = "+this.val;
        }
    }

    private avlNode root;
    public void insert(int val){
        root=insert(root,val);

    }
    private  avlNode insert(avlNode root,int valx){
        if(root==null)
            return new avlNode(valx);

        if(valx<root.val){
            root.leftChild=(root.leftChild,valx);
        }
        else{
            root.rightChild = (root.rightChild,valx);
        }

    return root;
    }

}
