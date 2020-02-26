## Introduction

Graphs are useful in modeling and solving real-world problems. For example, the problem to find the least number of flights between two cities can be modeled using a graph, where the vertices represent cities and the edges represent the flights between two adjacent cities. The problem of finding the minimal number of connecting flights between two cities is reduced to finding a shortesst path between two vertices in a graph.  

The study of graph problems is known as the *graph theory*. Graph theory was founded by Leonhard Eurler in 1736, when he introduced graph terminology to solve the famous *Seven Bridges of Konigsberg* problem. The city of Konisberg, Prussia (now Kaliningrad, Russia) was divided by the Pregel River. There were two islands on the river.  The city and islands were connected by seven bridges, as shown in the diagram below. The questions is, can one take a walk, cross each bridge exactly once, and return to the startign point? Euler proved it is not possible.  

![Konigsberg Bridge](KonigsbergBridge.png)

Looking at the graph we ask whether there is a path starting from any vertex, traversing all edges exactly once and returning to the starting vertex. Euler proved that for such a path to exist, each vertex must have an even number of edges. Therefore, the Seven Bridges of Konigsberg problem has no solution.   

Graph problems are often solven using algorithms. Graph algorithms have many applications in various areas such as computer science, mathematics, biology, engineering, economics, genetics, and social sciences.   

## Basic Graph Terminologies  

**Graph** - Graph is a mathematical structure that represents relationships among entities in the real world. A graph consists of nonempty set of vertices (aka nodes or points), and a set of edges that connect the vertices. For convenience, we define graph as G = (V,E) where V represents a set of vertices and E represents a set of edges.  
**Directed graph** - In a directed graph, each edge has a direction which indicates that you can ove from one vertex to the other through the edge. You can model parent child relationships using a directed graph where  an edge from A to B indicates that A is a parent of B. 
**Undirected graph** - In an undirected graph, you can move in both directions between vertices.
**Weighted graph** - Edges of a graph may have weights that indicates a meaningful value suchs as the flight time between the two cities.
**Unweighted graph** - Edges of a graph without weights.





