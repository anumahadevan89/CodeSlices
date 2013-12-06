package Code;
import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class RandomizedQueue<Item> implements Iterable{
    private int N=0,first=0,last=0;
    Item[] que;

    public RandomizedQueue(){

        que=(Item[])new Object[2];
    }
    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void resize(int max){
        assert N<=max;
        que=(Item[]) new Object[max];
        Item[] temp = null;
		for(int i=0;i<max;i++)
            temp[i]=que[(first+i)%que.length];
        que=temp;
        first=0;
        last=N;
    }

    public void enqueue(Item item){
        if(N==que.length)resize(2*que.length);
        if(isEmpty())first=1;
        que[++last]=item;
        if(last==que.length)last=0;
        N++;
    }

    public Item dequeue() throws Exception{
        if(isEmpty())
            throw new Exception();
        else{
            Item deleted=que[first];
            que[first]=null;
            first++;
            N--;
            if(que.length==N)first=0;
            if(que.length==N/4&& N>=0)resize(que.length/2);
            return deleted;
        }
    }


    public Iterator<Item> iterator(){
        return (Iterator<Item>) new ArrayIterator();
    }

    private class ArrayIterator{
    //	private static final Exception () = null;
    

	
        private int i=0;
        public ArrayIterator(){
        }

        public boolean hasNext(){
            return i<N;
        }

        public void remove(){
          //  throw new NoSuchOperationSupportedException;
        }

        public Item next() throws Exception{
            if(!hasNext()){
            	throw new Exception();
            }
            else{
                return que[i++];
            }
        }
    }
}
