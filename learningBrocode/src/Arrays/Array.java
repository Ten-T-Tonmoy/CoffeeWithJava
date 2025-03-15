package Arrays;

public class Array {
    private   int[] items;
    private   int count=0;
    public  Array(int length){
        items=new int[length];
        //oh so making traditional array
    }
    public  void print(){
        System.out.println();
        for(int i=0;i<count;i++){
            System.out.print(items[i]+" ");
        }
        System.out.println();
    }

    public void insert(int item){
        if(count==items.length){
            //vector apply
            //new array of 2x length
            int[] tempArr=new int[count*2];
            //copy all then insert!?
            for(int i=0;i<count;i++){
                tempArr[i]=items[i];
            }
            items=tempArr;

        }
        items[count++]=item;

    }
    public void removeAt(int idx){
        //validation of idx
        if(idx<0 || idx>=count)
            throw new IllegalArgumentException();
        //shift to left
        for(int i=idx;i<count-1;i++){
            items[i]=items[i+1];
        }
        count--;
    }
    public int indexOf(int value){
        for(int i=0;i<count;i++){
            if(items[i]==value)
                return i;
        }
        return -1;
    }
}
