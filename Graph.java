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
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int j,k;
			j=sc.nextInt();
			k=sc.nextInt();
			addEdge(j,k);
		}
		
		printGraph(graph);
	}
	
	
	
}
