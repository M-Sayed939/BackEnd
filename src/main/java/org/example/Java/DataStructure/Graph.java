package org.example.Java.DataStructure;

public class Graph {
    // Undirected Graph implementation
    public static class UndirectedGraph{
        private int V;
        private int E;
        private int[][] adjMatrix;
        public UndirectedGraph(int nodes){
            this.V = nodes;
            this.E = 0;
            this.adjMatrix = new int[nodes][nodes];
        }
        public void addEdge(int u, int v){
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
            E++;
        }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(V + " vertices, " + E + " edges " + "\n");
            for(int v = 0; v < V; v++){
                sb.append(v + ": ");
                for(int w : adjMatrix[v]){
                    sb.append(w + " ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }

    }
    // Directed Graph implementation
    public static class DirectedGraph{
        private int V;
        private int E;
        private int[][] adjMatrix;
        public DirectedGraph(int nodes){
            this.V = nodes;
            this.E = 0;
            this.adjMatrix = new int[nodes][nodes];
        }
        public void addEdge(int u, int v){
            adjMatrix[u][v] = 1;
            E++;
        }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(V + " vertices, " + E + " edges " + "\n");
            for(int v = 0; v < V; v++){
                sb.append(v + ": ");
                for(int w : adjMatrix[v]){
                    sb.append(w + " ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }
    public static void main(String[] args){
        UndirectedGraph graph = new UndirectedGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        System.out.println(graph.toString());
        DirectedGraph digraph = new DirectedGraph(4);
        digraph.addEdge(0, 1);
        digraph.addEdge(1, 2);
        digraph.addEdge(2, 3);
        digraph.addEdge(3, 0);
        System.out.println(digraph.toString());
    }


}
