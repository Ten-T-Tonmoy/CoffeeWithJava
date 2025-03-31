package HashTables;
// array of linked list
//insert lookup delete O(1) constant


import java.util.LinkedList;

public class hashTable {
    private class Portion{
        private int key;
        private   String value;

        // alt+i makes generate constructor/setter/getters
        public Portion(int key,String value) {
            this.value = value;
            this.key = key;
        }

    }

    private LinkedList<Portion>[] entries=new LinkedList[5];
    //make sure u dont import wrong one
    public void put(int key,String value){
        var idx=hash(key);
        if(entries[idx]==null){
            entries[idx]=new LinkedList<>();
            //bruh autoconfigured tf!
            //damn linkedlist behavior it will auto self re-configure
        }
        var bucket=entries[idx];
        for(var portion:bucket){
            //entries =>whole arraylist
            //entries[idx]=> linked list
            if(portion.key==key){
                portion.value=value;
                return;
            }

        }
        entries[idx].addLast(new Portion(key,value));
    }
    private int  hash(int key){
        return key% entries.length;
        //basically hashing shits of within 5
    }

    public String get(int key){
        //just send back string val if key comes
        var idx=hash(key);
        var bucket=entries[idx];
        if(bucket!=null ){
            for (var entry:bucket){
                if(entry.key==key){
                    return entry.value;
                }
            }
        }
        return null;
    }
    //key: and Value:
    //put(key,val)
    //get(k):v
    //remove(k)
    // <Integer,Strings> key,val
    //gonna be a ArrayList of both key,val pair
    //arraylist of linkedList<Entry>[] lmao


}
