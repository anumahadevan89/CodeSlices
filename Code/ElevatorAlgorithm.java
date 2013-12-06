package Code;

import java.util.Queue;

public class ElevatorAlgorithm {
	public class Node{
		int direction;
		int floorno;
		Node(int dir,int flno){
			direction=dir;
			floorno=flno;
		}
	}

	public class Lift{
		Queue<Node> q;
		Node currPos;
		
		void getLift(Node newreq){
		//	if()
			q.add(newreq);
			
		}
	}
	
	
}
