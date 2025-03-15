package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Allarrays {
    public static void main(String[] args){
        int[] nums=new int[5];
        int[] nums2={10,20,30};
        // just the syntax man
        Array arr=new Array(4);
        arr.insert(2);
        arr.insert(3);
        arr.insert(10);
        arr.insert(22);
        arr.removeAt(2);
        arr.insert(26);

        arr.print();
        System.out.println("22 is at index: "+arr.indexOf(22));

        nums[2]=50;

        //vector and arrayList dynamic arrays
        //vector will grow 100%
        // array list increases by 50%
        ArrayList<Integer> list=new ArrayList<>();
        list.add(19);
        list.add(2);
        list.add(22);
        // remove or removeAt indexOf contains size toArray()
        System.out.println(list);

        //wrapper generic class
        System.out.println(Arrays.toString(nums));

    }
}
