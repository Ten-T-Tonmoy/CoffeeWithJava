package HashTables;

import java.util.HashMap;
import java.util.Map;

public class usingHashTable {
    public static void main(String[] args){
        Map<Integer,String> tryinMap=new HashMap<>();
        // bruh here Map is the interface
        //And HashMap is implementation
        tryinMap.put(1,"abc");
        tryinMap.put(2,"abcd");
        tryinMap.put(3,"abcde");
        tryinMap.put(null,null); //cant be  duplicates
        tryinMap.remove("abc"); //gotta use key
        System.out.println("Contains key : "+tryinMap.containsKey(2));//runs on O(1)
        // tryinMap.containsValue("abcd"); //runs on O(n) yk why
        // map.entrySet() =>key,value pair  and keySet=>only key

        hashTable selfmap=new hashTable();
        selfmap.put(43,"kremlin");
        selfmap.put(12,"krawd");
        selfmap.put(5,"collison");
        selfmap.put(10,"collided");
        System.out.println(selfmap.get(10));

    }
}
