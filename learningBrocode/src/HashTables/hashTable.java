package HashTables;
// array of linked list
//insert lookup delete O(1) constant

public class hashTable {
    private class Entry{
        private int key;
        private   String value;

        public Entry(int key,String value){
            this.key=key;
            this.value=value;
        }
    }
    //key: and Value:
    //put(key,val)
    //get(k):v
    //remove(k)
    // <Integer,Strings> key,val
    //gonna be a ArrayList of both key,val pair
    //arraylist of linkedList<Entry>[] lmao

}
