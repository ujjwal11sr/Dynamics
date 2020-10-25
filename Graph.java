import java.util.LinkedList;

public class Graph{
	int V;
	LinkedList<Integer> adjArrayList[]; 
	Graph(int V){
		this.V = V;
		adjArrayList = new LinkedList[V];
		for(int i=0;i<V;i++){
			adjArrayList[i] = new LinkedList<>();
		}
	}
	static void addEdge(Graph graph, int src,int des){
		graph.adjArrayList[src].addFirst(des);
		graph.adjArrayList[des].addFirst(src);
	}
	static void printGraph(Graph graph){
		for(int v = 0; v < graph.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: graph.adjArrayList[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
	}
	public static void main(String args[]){
		int V=5;
		Graph graph = new Graph(V);
		addEdge(graph,0,1);
		addEdge(graph,0,4);
		addEdge(graph,1,4);
		addEdge(graph,1,3);
		addEdge(graph,1,2);
		addEdge(graph,2,3);
		
		printGraph(graph);
	}
	
	
	
}