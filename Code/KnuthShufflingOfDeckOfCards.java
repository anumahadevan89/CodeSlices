package Code;

import java.util.Random;

public class KnuthShufflingOfDeckOfCards {
	
	public static void exch(int a, int b){
		a=a^b;
		b=a^b;
		a=a^b;
	}
	
	public static void shuffleCards(){
		int randno;
		Random rand=new Random();
		for(int i=0;i<52;i++){
			randno=rand.nextInt(i+1);
			System.out.println(randno);
			exch( i, randno);
		}
	}
	
	public static void main(String args[]){
		shuffleCards();
	}
}
