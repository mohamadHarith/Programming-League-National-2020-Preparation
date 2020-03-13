/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;


class HamiltonianPath {
    
    public static class Graph{

        public int numberOfVertices;
        public LinkedList<Integer> edges[];

        public Graph(int numberOfVertices){
            this.numberOfVertices = numberOfVertices;
            edges = new LinkedList[numberOfVertices];
            for (int i = 0; i < numberOfVertices; i++) { 
                edges[i] = new LinkedList(); 
            } 
        }

        public void addEdge(int startVertex, int endVertex){
            
            //add edge at the start vertex index
            edges[startVertex-1].add(endVertex);
        }

        public void dfs(int vertex){
            boolean[] isVisted = new boolean[this.numberOfVertices];
            ArrayList<Integer> searchPath = new ArrayList<>();

           //System.out.println("Passed vertex: " + vertex);
            //initialize isVisited
            for(int i=0; i<isVisted.length; i++){
                isVisted[i] = false;
            }

            //recursively search
            int vertexIndex = vertex-1;
            //System.out.println("vertex index: " + vertexIndex);
            dfs(vertexIndex, searchPath, isVisted);

            System.out.println(searchPath);
            


        }

        public void dfs(int vertexIndex,  ArrayList<Integer> searchPath, boolean[] isVisted){
            //store the visited vertex
            searchPath.add(vertexIndex+1);
            isVisted[vertexIndex] = true;
            //System.out.println("neighbour vertex for: "+ (vertexIndex+ 1) + " is " + this.edges[vertexIndex]);
            for(int neighbourVertex: this.edges[vertexIndex]){
                if(!isVisted[neighbourVertex-1]){
                    //System.out.println("Neighbour " + neighbourVertex + "hasnt been visited");
                   dfs(neighbourVertex-1, searchPath, isVisted);
                }
            }
        }
            
    }
    
    public static void  main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {

            final int numberOfTestCases = sc.nextInt();
            
            for(int i=0; i<numberOfTestCases; i++){
                final int numOfVertices = sc.nextInt();
                 final int numOfEdges = sc.nextInt();
                 Graph graph = new Graph(numOfVertices);

                for(int j=0; j<numOfEdges; j++){
                  
                if(sc.hasNextInt()){
                   //System.out.print(sc.nextInt());
                    //System.out.print(sc.nextInt());
                    int startVertex = sc.nextInt();
                    int endVertex = sc.nextInt();
                    // System.out.println("Test case: " + i );
                    // System.out.println("Start vertex: " + startVertex);
                    // System.out.println("End vertex: " + endVertex);
                    graph.addEdge(startVertex, endVertex);
                  }
                    
                  
                }
                for(int k=0; k<graph.edges.length; k++){
                    //System.out.print(graph.edges[k].toString());
                }
               //dfs start from vertex index 0
                //System.out.println("path");
                graph.dfs(1);   
            }
        
        } catch (Exception e) {
            System.out.print(e);
        
        }
    }
}