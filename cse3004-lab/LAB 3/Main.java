import java.util.*;
public class Main{
static double fibRecurs(double a)
{
if (a <= 1)
return a;
return fibRecurs(a-1) + fibRecurs(a-2);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double f = sc.nextDouble();
for(int i =0; i< f; i++){
System.out.println(fibRecurs(i)+ " ");
}
}
}