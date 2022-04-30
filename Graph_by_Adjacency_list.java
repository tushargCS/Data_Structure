import java.util.LinkedList;
import java.util.Scanner;

public class Graph_by_Adjacency_list {
   private static LinkedList<Integer> Graph[];
    public  Graph_by_Adjacency_list(int v){
        Graph= new LinkedList[v];
        for(int i=0;i<v;i++){
            Graph[i]=new LinkedList<Integer>();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Edges and Vertices");
        int e=sc.nextInt();
        int v=sc.nextInt();
        Graph_by_Adjacency_list obj= new Graph_by_Adjacency_list(v);
        for (int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            insertEdges(s,d);
        }
    }
    public static void insertEdges(int s,int d){
            Graph[s].add(d);
            Graph[d].add(s);

        System.out.print(Graph[d]);
        System.out.print(Graph[s]);
    }

}
