package Code;

public class MyException extends Exception {
	int a;
	public MyException(int b){
		a=b;
	}
	public String toString(){
		return "Exception no : "+a;
	}
	
	public static void main(String args[]) {
		
		MyException e= new MyException(3);
		System.out.println(e.toString());
		
	}

}
