package AVL_Tress;
//Self Balancing BSTree to avoid skewness or unbalance
//Adelson-Velsky and Landis tree
// also Red-black tree, B-trees,2-3 trees are self balancing


import java.util.Map;

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
        private int height;

        public avlNode(int value){
            this.val=value;
        }

        //overRide keyword does shits fr
        @Override
        public String toString(){
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
            root.leftChild=insert(root.leftChild,valx);
        }
        else{
            root.rightChild = insert(root.rightChild,valx);
        }
        root.height= Math.max(nodeHeight(root.leftChild),
                nodeHeight(root.rightChild))+1;
        //yea get it -1+1=0 for base
        balance(root);

    return root;
    }

    private void balance(avlNode node){
        //balance factor
        //if bf>1: print("left Heavy")
        //if bf<-1: print("right Heavy")
        var bf=balanceFactor(node);

        if(leftHeavy(node)){
            if(balanceFactor(node.leftChild)<0){
                //left rotation time
            }
            //right rotation is default
        } else if (rightHeavy(node)) {
            if(balanceFactor(node.rightChild)>0){
                //right rotation time
            }
            //left rotation by default
        }

    }
    private boolean leftHeavy(avlNode node){
        return balanceFactor(node)>1;
    }
    private boolean rightHeavy(avlNode node){
        return balanceFactor(node)<-1;
    }


    private  int balanceFactor(avlNode node){
        return node==null ? 0 :nodeHeight(root.leftChild)
                -nodeHeight(root.rightChild);

    }
    private  int nodeHeight(avlNode node){
        if(node==null)
            return -1;
        return node.height;
    }

}
