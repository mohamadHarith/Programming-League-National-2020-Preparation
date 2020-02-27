import java.util.*;
import java.lang.Integer;

public abstract class AbstractGraph<V> implements Graph<V>{
    //store vertices
    protected List<V> vertices = new ArrayList<>();
    //edge adjacency list
    protected List<List<Edge>> neighbours = new ArrayList<>();

    //empty constructor
    protected AbstractGraph(){};

    //constrcuted using vertices and edges stored in arrays
    protected AbstractGraph(V[] vertices, int[][] edges){
        for(int i=0; i<vertices.length; i++){
            addVertex(vertices[i]);
        }
        createAdjacencyList(edges, vertices.length);
    };

    // //empty constructor
    // protected AbstractGraph(List<V> vertices){};

    // //empty constructor
    // protected AbstractGraph(){};

    // //empty constructor
    // protected AbstractGraph(){};

    //create adjacency lists for each vertex
    private void createAdjacencyList(int[][] edges, int numberOfVertices){
        for(int i=0; i<edges.length; i++){
            addEdge(edges[i][0], edges[i][1]);
        }
    }

    //   //create adjacency lists for each vertex
    // private void createAdjacencyList(List<Edge> edges, int numberOfVertices){
    //     for(Edge edge: edges){
    //         addEdge(edge.u , edge.v);
    //     }
    // }


    @Override
    public int getSize(){
        return vertices.size();
    }

    @Override
    public List<V> getVertices(){
        return vertices;
    }

     @Override
    public V getVertex(int index){
        return vertices.get(index);
    };

     @Override
    public int getIndex(V v){
        return vertices.indexOf(v);
    };

     @Override
    public List<Integer> getNeighbours(int index){
        List<Integer> result = new ArrayList<>();
        for(Edge e: neighbours.get(index)){
            result.add(e.v);
        }
        return result;
    };

     @Override
    public int getDegree(int v){
        return neighbours.get(v).size();
    };

     @Override
    public void printEdges(){
        for(int u=0; u<neighbours.size(); u++){
            System.out.print(getVertex(u) + "(" + u + "): ");
            for(Edge e: neighbours.get(u)){
                System.out.print("(" + getVertex(e.u) + "," + getVertex(e.v) + ")");
            }
        }
        System.out.println();
    };

    @Override
    public void clear(){
        vertices.clear();
        neighbours.clear();
    };

     @Override
    public boolean addVertex(V vertex){
        if(!vertices.contains(vertex)){
            vertices.add(vertex);
            neighbours.add(new ArrayList<>());
            return true;
        }
        else{
            return false;
        }
    };


    public boolean addEdge(Edge e){
        if(e.u < 0 || e.u > getSize()-1){
            throw new IllegalArgumentException("No such index: " + e.u);
        }
        if(e.v < 0 || e.v > getSize()-1){
            throw new IllegalArgumentException("No such index: " + e.v);
        }
        if(!neighbours.get(e.u).contains(e)){
            neighbours.get(e.u).add(e);
            return true;
        }
        else{
            return false;
        }
    };

    @Override
    public boolean addEdge(int u, int v){
        return addEdge(new Edge(u,v));
    }

    //edge inner class
    public  static class Edge{
        int u;
        int v;
        
        public Edge(int u, int v){
            this.u = u;
            this.v = v;
        }
    
        public boolean equals(Object o){
            return u == ((Edge)o).u && v == ((Edge)o).v;
        }
    }

    //tree inner class for parent child relationships
    public class Tree{
        private int root;
        private int[] parent;
        private List <Integer> searchOrder;

        //construct a tree with root, parent and search order
        public Tree(int root, int[] parent, List<Integer> searchOrder){
            this.root = root;
            this.parent = parent;
            this.searchOrder = searchOrder;
        }

        public int getRoot(){
            return root;
        }

        public int getParent(int v){
            return parent[v];
        }

        public List<Integer> getSearchOrder(){
            return searchOrder;
        }

        public int getNumberOfVerticesFound(){
            return searchOrder.size();
        }

        //return path of vertices from a vertex to the root
        public List<V> getPath(int index){
            ArrayList<V> path = new ArrayList<>();
            do{
                path.add(vertices.get(index));
                index = parent[index];
            }
            while(index != 1);

            return path;
        }

        //print path from the root to vertex v
        public void printPath(int index){
            List<V> path = getPath(index);
            System.out.print("A path from " + vertices.get(root) + " to " + vertices.get(index) + ": ");
            for(int i = path.size()-1; i >=0; i--){
                System.out.print(path.get(i) + " ");
            }
        }

        //print the whole tree
        public void printTree(){
            System.out.println("Root is: " + vertices.get(root));
            System.out.print("Edges: ");
            for(int i = 0; i < parent.length; i++){
                if(parent[i] != -1){
                    //Display an edge
                    System.out.print("(" + vertices.get(parent[i]) + ", " + vertices.get(i) + ")");
                }
            }
            System.out.println();
        }
    }

    
}