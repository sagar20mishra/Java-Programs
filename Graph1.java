package p1;
import java.util.*;
public class Graph1 {
	static class Edge{
		int src;
		int dest;
		int wt;
		public Edge(int s,int d,int w) {
			this.src=s;
			this.dest=d;
			this.wt=w;
		}
	}
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,2,2));
		
		graph[1].add(new Edge(1,2,10));
		graph[1].add(new Edge(1,3,0));
		
		graph[2].add(new Edge(2,0,2));
		graph[2].add(new Edge(2,3,-1));
		graph[2].add(new Edge(2,1,10));
		
		graph[3].add(new Edge(3,2,-1));
		graph[3].add(new Edge(3,1,0));
		
		
	}
	public static void bfs(ArrayList<Edge>graph[],int v) {
		Queue<Integer>q=new LinkedList<>();
		boolean vis[]=new boolean[v];
		q.add(0);
		while(!q.isEmpty()) {
			int curr=q.remove();
			if(vis[curr]==false) {
				System.out.print (curr+" ");
				vis[curr]=true;
				for(int i=0;i<graph[curr].size();i++) {
					Edge e=graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int v=4;
          ArrayList<Edge>graph[]=new ArrayList[v];
          createGraph(graph);
          //print 2's neighbour
          System.out.println("2's neighbour with their distance");
          for(int i=0;i<graph[2].size();i++) {
        	  Edge e=graph[2].get(i);
        	  System.out.println(e.dest+" "+e.wt);
        	  
          }
          System.out.println("BFS traversal of tree");
          bfs(graph,v);
	}

}