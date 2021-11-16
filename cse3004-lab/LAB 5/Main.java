import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
 static int compute_refills(int dist,int tank,int stops[],int n){
 int current_refills=0;
 int num_refills=0;
 int last_refill=0;
 while(current_refills<=n) {
 last_refill = current_refills;
 while ((current_refills <= n) && (stops[current_refills + 1] - stops[last_refill]) <= tank)
{
 current_refills = current_refills + 1;
 }
 if (current_refills == last_refill)https://www.onlinegdb.com/online_java_compiler#tab-stdin
 return -1;
 if (current_refills <= n)
 num_refills = num_refills + 1;
 }
 return num_refills;
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter values: ");
 int total = scanner.nextInt();
 int dist = scanner.nextInt();
 int tank = scanner.nextInt();
 
 
 int n = scanner.nextInt();
 int stops[] = new int[n+2];
 stops[0] = 0;
 stops[n+1] = dist;
 System.out.println("Enter the stop distance from starting point: ");
 for (int i = 1; i <= n; i++) {
 System.out.println("Enter the value for stop"+i);
 stops[i] = scanner.nextInt();
 }
 System.out.println(compute_refills(dist,tank,stops,n));
 System.out.println("remaining distance"+ (total-dist));
 }
}
