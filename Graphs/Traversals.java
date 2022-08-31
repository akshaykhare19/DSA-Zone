import java.util.*;
public class Traversals
{
    private static void bfs(ArrayList<Integer> graph[], int node, boolean visited[], ArrayList<Integer> ans)
    {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(node);
        visited[node] = true;
        while(!q.isEmpty()){
            int nn = q.poll();
            ans.add(nn);

            for(int nbr : graph[node]){
                if(!visited[nbr]){
                    q.add(nbr);
                    visited[nbr] = true;
                }
            }
        }
    }

    private static ArrayList<Integer> bfsTraversal(ArrayList<Integer> graph[], int v)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[v];

        for(int i = 0; i < v; i++){
            if(!visited[i]){
                bfs(graph, i, visited, ans);
            }
        }
        return ans;
    }

    public static void main(String args[])
    {
        int v = 5;
        ArrayList<Integer> graph[] = new ArrayList[v];

        for(int i = 0; i < v; i++){
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(1);
        graph[0].add(4);
        
        graph[1].add(0);
        graph[1].add(2);

        graph[2].add(1);
        graph[2].add(3);

        graph[3].add(2);

        graph[4].add(0);

        for(int i = 0; i < v; i++){
            System.out.print(i + " -> ");
            for(int e : graph[i]){
                System.out.print(e + "\t");
            }
            System.out.println();
        }

        System.out.println("BFS - " + bfsTraversal(graph, v));
        // System.out.println("DFS - " + dfsTraversal());

    }    
}
