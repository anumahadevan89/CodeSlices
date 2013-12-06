package Code;
import java.io.*;

public class Nexthigherpowerof2 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int x=0;
		n=n<<1;
		while(n!=0){
			x=n;
			n=n&n-1;
		}
	System.out.println(x);
	}
}
