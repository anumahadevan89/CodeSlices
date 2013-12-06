package Code;

public class HashTable {
/*
 * public class HashTable {

    private Item[] data;
    private int capacity;
    private int size;
    private static final Item AVAILABLE = new Item("Available", null);

    public HashTable(int capacity) {

        this.capacity = capacity; 
        data = new Item[capacity];
        for(int i = 0; i < data.length; i++) {

            data[i] = AVAILABLE;
        }
        size = 0;
    }

    public int size() {

        return size;
    }

    public int hashThis(String key) {

        return key.hashCode() % capacity; 
    }

    public Object get(String key) {

        int hash = hashThis(key);

        while(data[hash] != AVAILABLE && data[hash].key() != key) {

            hash = (hash + 1) % capacity;
        }
        return data[hash].element();
    }

    public void put(String key, Object element) {

        if(key != null) {
            size++;
            int hash = hashThis(key);
            while(data[hash] != AVAILABLE && data[hash].key() != key) {

                hash = (hash + 1) % capacity;
            }

            data[hash] = new Item(key, element);

        }

    }

    public Object remove(String key) {

        // not important now.
    }

    public String toString() {

        String s = "<HashTable[";
        for(int i = 0; i < this.size(); i++) {

            s += data[i].toString();
            if(i < this.size() - 1) {

                s += ",";
            }
        }
        s += "]>";
        return s;
    }

}
For more clarity, this is the Item class:

public class Item {

    private String key;
    private Object element;

    public Item(String key, Object element) {

        this.setKey(key);
        this.setElement(element);
    }

    public String key() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object element() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public String toString() {

        String s = "<Item(";
        s += this.key() + "," + this.element() + ")>";
        return s;
    }

}

 */
	private int capacity;
	private static int size;
	
	public static class Hash{
		String key;
		String value;
		public Hash(){
			
		}
		public Hash(String key,String val ){
			this.key=key;
			this.value=val;
		}
	}
	
	private Hash hashtab[];
	
	public HashTable(int capacity){
		size=0;
		this.capacity=capacity;
		hashtab=new Hash[capacity];
	}
	public int size(){
		return size;
	}
	public static void push(String key,String val){
		if(key!=null){
			size++;
			
		}
	}
}
