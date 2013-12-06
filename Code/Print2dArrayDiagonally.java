package Code;

public class Print2dArrayDiagonally {
	public static int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
	public static int min(int a, int b){
		return a<b?a:b;
	}
	
	public static int max(int a, int b){
		return a>b?a:b;
	}
		
	public static void printDiagonal(int[][] arr){
		int rows=arr.length;
		int colms=arr[0].length;
		System.out.println(rows+"##"+colms);
		for(int line=0;line< rows+colms-1;line++){
			int startColm=max(0,line-(rows-1));
			int count=min((rows-1)-startColm,line+1);
			int startRow=min(line,rows-1);
			for(int j=0;j<count;j++){
				System.out.print(arr[startRow-j][startColm+j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		printDiagonal(arr);
	}

}
