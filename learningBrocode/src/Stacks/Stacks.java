package Stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] arg){
        //using native stack
        Stack<Integer> natStack=new Stack<>();
        natStack.add(2);
        natStack.add(3);
        natStack.add(1);
        natStack.add(12);
        natStack.add(11);
        natStack.add(10);
        int forsaken=natStack.pop();
        int current=natStack.peek();
        System.out.println("forsaken: "+forsaken+" current : "+current);
        //Last in First Out
        System.out.println("Native Stack : "+natStack.toString());

    }
}
