package Code;
//implementing a max heap
public class HeapSortImplementation {
	
	static int arr[];
	static int N;
	public HeapSortImplementation(int capacity) {
		arr=new int[capacity];
		N=0;
	}
	
	public static void swim(int k){
			while(k<N&&arr[k]>arr[k/2]){
				exchange(k,k/2);
				k=k/2;
		}
	}
	
	public static  void sink(int k){
        while(k<N){
            int j=2*k;
            if(j<N && arr[j]<arr[j+1])j++;
            if(arr[j]<arr[k])break;
            exchange(j,k);
            j=k;
        }
	}
    
	
	public static void insert(int item){
		arr[++N]=item;
		swim(N);
	}
	
	public int delMax(){
		int item=arr[1];
		exchange(N--, 1);
		sink(1);
	//	arr[N+1]=(Integer) null;
		return item;
		
	}
	
	public static void exchange(int i,int j){
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	
public static void main(String args[]){
		HeapSortImplementation hs=new HeapSortImplementation(5);
		for(int i=1;i<20;i+=5){
			hs.insert(i);
		}
		for(int i=0;i<hs.arr.length;i++){
			System.out.println(hs.arr[i]);
		}
		System.out.println(hs.delMax());
		for(int i=0;i<hs.arr.length;i++){
			System.out.println(hs.arr[i]);
		}
	}
}
