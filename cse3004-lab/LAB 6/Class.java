import java.util.*;
public class Class {
static void money(int s){
List<Integer> d = new ArrayList();
d.add(1);
d.add(5);
d.add(10);
int n = d.size();
List<Integer> l = new ArrayList();
for(int i=n-1;i>=0;i--){
while (s >= d.get(i))
{
s -= d.get(i);
l.add(d.get(i));
}
}
System.out.println(" The number of minimum coins are: " +
l.size());
for(int i=0;i<l.size();i++)
System.out.print(l.get(i)+" ");
}
public static void main(String args[]) {
System.out.println("Enter the amount:");
Scanner myobj = new Scanner(System.in);
int m = myobj.nextInt();
money(m);
}
}