package Code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DFSGraph {

	int V;
	ArrayList<List<Integer>> adj;
	DFSGraph(int v){
		this.V=v;
		adj=new ArrayList<List<Integer>>();
		for(int i=0;i<V;i++){
	//		adj[i]=new List<Integer>();
		}
	}
	void addEdge(int v,int w){
		adj.get(v).add(w);
		}
	void DFSUtil(int v,boolean[] visited){
		visited[v]=true;
		System.out.println(v);
		for(int i=0;i<adj.size();i++){
			if(!visited[i]){
				DFSUtil(i,visited);
			}

		}
	}
	void DFS(){
		boolean[] visited=new boolean[V];
		for(int i=0;i<V;i++){
			visited[i]=false;
		}
		for(int i=0;i<V;i++){
			if(visited[i]==false){
				DFSUtil(i, visited);
			}
		}
	}
	public static void main(String args[]){
		DFSGraph g=new DFSGraph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		System.out.println("DFS");
		g.DFS();
	}
}
