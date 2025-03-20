package Trees;
//used in websites,GUIs,

//Binary tress 2 leaf nodes at max
//hierarchial data mmh
//also autocompletion
//compilers
//also in jpeg compression
//left<node<right sequence
//basically to apply binary search broh O(log n)
//same with insert and delete


public class UsingTrees {
    public static void main(String[] arg){
        Trees tree =new Trees();
        tree.insert(8);
        tree.insert(4);
        tree.insert(12);
        tree.insert(2);
        tree.insert(6);
        tree.insert(10);
        tree.insert(14);
        /*
                8
              /   \
             4     12
            / \    /  \
           2   6  10   14
         */

        System.out.println("chud gaye guru");
//          tree.preOrder(); //  shit works
//            tree.inOrder();  //  shit works
//        tree.postOrder(); //  shit works
//        System.out.println(tree.height());  //if it works dun touch
//        System.out.println(tree.min2());  //if it works dun touch
        var resOrder=(tree.nodeAtDistance(2));
        // System.out.println(resOrder.toString());
        // damn storing levels in a arrayList cool
        tree.levelOrder();
        System.out.println("Number 10 exists : "+tree.find(10) );
    }
}
