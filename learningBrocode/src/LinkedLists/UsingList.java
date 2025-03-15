package LinkedLists;

import java.util.Arrays;

public class UsingList {
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addlast(2);
        list.addlast(3);
        list.addlast(11);
        list.addlast(14);
        int test=list.indexOf(11);
        list.addlast(17);
        list.deleteFirst();
        list.deleteLast();
        System.out.println("Size of the LL is : "+list.size());
        System.out.println("Index of 11 is : "+test);
        var arrayed = list.toArray();
        System.out.println(Arrays.toString(arrayed));
        //damn Arrays.toString shiiis
        list.addlast(17);

        System.out.println("Size of the LL is : "+list.size());
        java.util.LinkedList<String> x=new java.util.LinkedList<>();
    }
}
