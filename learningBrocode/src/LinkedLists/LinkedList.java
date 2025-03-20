package LinkedLists;

import Arrays.Array;

import java.util.NoSuchElementException;

public class LinkedList {
    //Node Classs here
    private class Node {
        private int val;
        private Node next;
        //self referencing object
        public Node(int value){
            this.val=value;
        }
        public void setNext(Node next) {
            this.next = next;
        }
        public void setVal(int value){
            this.val=value;
        }
    }


    private Node first;
    private Node last;
    private int size;
    //addlast
    public  void  addlast(int value){
        var node=new Node(value);
        //var lets the comp decide what it is
        if(isEmpty()){
            first=last=node;
        }

        else{
            //yea adding on last .last on stringed
            last.next=node;
            last=node;
            //its like always adding on the end
        }

        size++;
    }
    public void addFirst(int value){
        Node node=new Node(value);
        if(isEmpty())
            first=last=node;
        else {
            node.next=first;
            first=node;
        }
        size++;
    }
    private boolean isEmpty(){
        return first==null;
    }
    public int indexOf(int target){
        if(isEmpty())
            return -1;
        int idx=0;
        //first has the next set to null
        var current=first;
        while (current!=null){
            if(current.val==target){
                return idx;
            }
            current=current.next;
            idx++;
        }
        return -1;
    }

    //deleteFirst
    public void deleteFirst(){
        // first=null
        //10->20->30->last
        if(isEmpty())
            throw new NoSuchElementException();
        //edgeCases
        if(first==last){
            first=last=null;
            size=0;
            return;
        }
        var second=first.next;
        first.next=null;
        first=second;
        size--;
    }

    //deleteLast
    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        //last er last.next==null
        if(first==last){
            first=last=null;
            size=0;
            return;
        }
        var current=first;
        while (current!=null){
            if(current.next.next==null)
                break;
            //remeber not to cause shit in ifs
            current=current.next;
        }
        last=current;
        current.next=null;
        //before disconnecting stringed always store
        size--;
    }

    //contains
    public boolean contains(int target){
        if(isEmpty())
            return false;
        return indexOf(target)!=-1;
    }
    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] arr=new int[size];
        int i=0;
        var current=first;
        while (current!=null){
            arr[i]=current.val;
            i++;
            current=current.next;
        }
        return  arr;
    }

    public void reverse(){
        //-----------------important shit------------------
        //just gonna change the sequence
        var prev=first;
        var cur=first.next;
        last=first;
        last.next=null;
        while (cur!=null){
            //next will be cur and cur will be prev
            var next=cur.next;//storing next
            cur.next=prev;
            prev=cur;
            cur=next;
            //10->20->30->40
            //p <- c <- n
            //    p   c   n
        }
        first=prev;//when ends prev will reach there

    }



}
