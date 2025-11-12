import java.util.*;
class Graph{
    ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    Graph(int vertex){
        for(int i=0;i<vertex;i++){
            graph.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    boolean find(int start, int end,boolean visited[]){
        if(start==end){
            return true;
        }
        visited[start]=true;
        for(int neighbor:graph.get(start)){
            if(!visited[neighbor]){
                if(find(neighbor,end,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}

public class IsPathAvail
{
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,0);
		boolean a[]=new boolean[5];
		if(g.find(0,2,a)){
		    System.out.print("Path Exists");
		}
		else{
		    System.out.print("No path");
		}
	}
}
