import java.util.*;
import java.lang.*;
import java.io.*;
public class MST {
 private static final int A = 5;
 int minKey(int key[], Boolean mstSet[])
 {
 int min = Integer.MAX_VALUE, min_index = -1;
 for (int a = 0; a < A; a++)
 if (mstSet[a] == false && key[a] < min) {
 min = key[a];
 min_index = a;
 }
 return min_index;
 }
 void printMST(int parent[], int graph[][])
 {
 System.out.println("Edge \tWeight");
 for (int i = 1; i < A; i++)
 System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
 }
void primMST(int graph[][])
 {
 int parent[] = new int[A];
 int key[] = new int[A];
 Boolean mstSet[] = new Boolean[A];
 for (int i = 0; i < A; i++) {
 key[i] = Integer.MAX_VALUE;
 mstSet[i] = false;
 }
 key[0] = 0;
 parent[0] = -1;
 for (int count = 0; count < A - 1; count++) {
 int u = minKey(key, mstSet);
 mstSet[u] = true;
 for (int a = 0; a < A; a++)
 if (graph[u][a] != 0 && mstSet[a] == false && graph[u][a] < key[a]) {
 parent[a] = u;
 key[a] = graph[u][a];
 }
 }
 printMST(parent, graph);
 }
 public static void main(String[] args) {
 MST t = new MST();
 int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
 { 2, 0, 3, 8, 5 },
 { 0, 3, 0, 0, 7 },
 { 6, 8, 0, 0, 9 },
 { 0, 5, 7, 9, 0 } };
 t.primMST(graph);
 }
 
}