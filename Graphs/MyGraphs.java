import java.util.*;

public class MyGraphs
{
    public static class Edge
    {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt)
        {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String args[])
    {
        int n = 5;
        ArrayList<Edge> graph[] = new ArrayList[n];

        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 0, 10));

        graph[1].add(new Edge(1, 2, 20));
        graph[2].add(new Edge(2, 1, 20));
        
        graph[3].add(new Edge(3, 2, 40));
        graph[2].add(new Edge(2, 3, 40));
        
        graph[4].add(new Edge(4, 0, 50));
        graph[0].add(new Edge(0, 4, 50));

        for(int i = 0; i < n; i++){
            System.out.print(i + " -> ");
            for(Edge e : graph[i]){
                System.out.print("( " + e.src + ", " + e.nbr + ", " + e.wt + " )");
            }
            System.out.println();
        }


    }


} 