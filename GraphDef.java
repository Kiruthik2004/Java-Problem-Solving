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
    void display(){
        for(int i=0;i<graph.size();i++){
            System.out.print(i+" -> ");
            for(int j=0;j<graph.get(i).size();j++){
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

public class GraphDef
{
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,0);
		g.display();
	}
}
