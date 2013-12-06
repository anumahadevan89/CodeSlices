package Code;
import java.io.*;

public class NearestMultiple {

	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n,b;
		System.out.println("Enter to be rounded");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter number around which first number is to be rounded");
		b=Integer.parseInt(br.readLine());
		int res=(n+(b-1))&~(b-1);
		System.out.println(res);
	}
	
}
