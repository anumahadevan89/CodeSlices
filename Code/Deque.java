package Code;
import java.io.*;
public class Deque<Item> implements Iterable{
    private int count;
    
    private class Node<Item>{
        Item item;
        Node next,prev;

        Node(Item data){
            if(data==null){
                throw new NullPointerException();
            }
            else{
            item=data;
            next=null;
            prev=null;
            }
        }
    }
    private Node first,last;

    public class Deque{
        count=0;
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return count;
    }

    public void addFirst(Item item){
        Node data=new Node(item);
        
        if(isEmpty()){
            first=data;
            last=data;
        }
        else{
             data.next=first;
            first.prev=data;
            first=data;
        }
        count++;
    }

    public void addLast(Item item){
        Node data=new Node(item);
        if(isEmpty()){
            first=data;
            last=data;
        }
        else{
            last.next=data;
            date.prev=last;
            last=data;
        }

        count++;
    }

    public Item removeFirst(){
        if(isEmpty())
            throw new java.lang.NoSuchElementException;
        else{
            Item deleted=first.item;
            first=first.next;
            first.prev=null;
            return deleted;
        }
        count--;
    }

    public Item removeLast(){
        if(isEmpty())
            throw new java.lang.NoSuchElementException();
        else{
            Item deleted=last.item;
            last=last.prev;
            last.next=null;
            return deleted;
        }
    count--;
    }

    public Iterator<Item> iterator(){
        return new LLIterator();
    }

    private class LLIterator(){
        private Node list;
        public LLIterator(){
            list=super.first;
        }

        public boolean hasNext(){
            return list.next==null;
        }

        public remove(){
            throw new NoSuchOperationSupportedException;
        }

        public Item next(){
            if(!hasNext()){
                throw new NoSuchElementException;
            else{
                Item returnvalue=list.item;
                list=list.next;
                return returnvalue;
            }
    }
    
}
