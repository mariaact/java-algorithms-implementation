package aplicacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.jwetherell.algorithms.graph.*;
import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.TYPE;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;


public class Main {

  public static class Grafo { // Cramos clase grafo y le añadimos sus vertices y aristas con sus costes 
    final List<Vertex<Integer>> vert = new ArrayList<Vertex<Integer>>();

    final Graph.Vertex<Integer> v1 = new Graph.Vertex<Integer>(1);
    final Graph.Vertex<Integer> v2 = new Graph.Vertex<Integer>(2);
    final Graph.Vertex<Integer> v3 = new Graph.Vertex<Integer>(3);
    final Graph.Vertex<Integer> v4 = new Graph.Vertex<Integer>(4);
    final Graph.Vertex<Integer> v5 = new Graph.Vertex<Integer>(5);
    final Graph.Vertex<Integer> v6 = new Graph.Vertex<Integer>(6);
    final Graph.Vertex<Integer> v7 = new Graph.Vertex<Integer>(7);
    final Graph.Vertex<Integer> v8 = new Graph.Vertex<Integer>(8);
    final Graph.Vertex<Integer> v9 = new Graph.Vertex<Integer>(9);
    final Graph.Vertex<Integer> v10 = new Graph.Vertex<Integer>(10);
    final Graph.Vertex<Integer> v11 = new Graph.Vertex<Integer>(11);
    final Graph.Vertex<Integer> v12 = new Graph.Vertex<Integer>(12);
   
    {
      vert.add(v1); // añadir vertices a la lista 
      vert.add(v2);
      vert.add(v3);
      vert.add(v4);
      vert.add(v5);
      vert.add(v6);
      vert.add(v7);
      vert.add(v8);
      vert.add(v9);
      vert.add(v10);
      vert.add(v11);
      vert.add(v12);
    }

    final List<Edge<Integer>> aris = new ArrayList<Edge<Integer>>(); //Creamos las aristas con sus respectivos costes

    final Graph.Edge<Integer> de1a2 = new Graph.Edge<Integer>(1, v1, v2);
    final Graph.Edge<Integer> de1a3 = new Graph.Edge<Integer>(2, v1, v3);
    final Graph.Edge<Integer> de1a4 = new Graph.Edge<Integer>(3, v1, v4);
    final Graph.Edge<Integer> de2a5 = new Graph.Edge<Integer>(12, v2, v5);
    final Graph.Edge<Integer> de2a3 = new Graph.Edge<Integer>(3, v2, v3);
    final Graph.Edge<Integer> de3a6 = new Graph.Edge<Integer>(30, v3, v6);
    final Graph.Edge<Integer> de3a7 = new Graph.Edge<Integer>(5, v3, v7);
    final Graph.Edge<Integer> de4a7 = new Graph.Edge<Integer>(12, v4, v7);
    final Graph.Edge<Integer> de5a8 = new Graph.Edge<Integer>(7, v5, v8);
    final Graph.Edge<Integer> de5a9 = new Graph.Edge<Integer>(9, v5, v9);
    final Graph.Edge<Integer> de5a10 = new Graph.Edge<Integer>(4, v5, v10);
    final Graph.Edge<Integer> de6a10 = new Graph.Edge<Integer>(1, v6, v10);
    final Graph.Edge<Integer> de7a10 = new Graph.Edge<Integer>(3, v7, v10);
    final Graph.Edge<Integer> de7a11 = new Graph.Edge<Integer>(8, v7, v11);
    final Graph.Edge<Integer> de7a12 = new Graph.Edge<Integer>(16, v7, v12);

    
    {
        aris.add(de1a2);
        aris.add(de1a3);
        aris.add(de1a4);
        aris.add(de2a5);
        aris.add(de2a3);
        aris.add(de3a6);
        aris.add(de3a7);
        aris.add(de4a7);
        aris.add(de5a8);
        aris.add(de5a8);
        aris.add(de5a10);
        aris.add(de6a10);
        aris.add(de7a10);
        aris.add(de7a11);
        aris.add(de7a12);


    }

    final Graph<Integer> graph = new Graph<Integer>(vert, aris);

  }

  public static void main(String[] args) {
  	final Grafo grafo = new Grafo(); //instanciar clase y crea objeto 

    final Graph.Vertex<Integer> empieza = grafo.v1; //Empezamos en v1
    final Graph.Vertex<Integer> termina = grafo.v10; // Vamos a v10
    
    {
  	  final AStar<Integer> aStar = new AStar<Integer>();

      final List<Graph.Edge<Integer>> path = aStar.aStar(grafo.graph, empieza, termina); //Le pasamos como parameters los datos que queremos 
      
      System.out.println("El mejor camino es a destino es\n" + path);
  	}
  }
}