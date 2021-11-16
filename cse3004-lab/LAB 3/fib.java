import java. util.*;
public class fib {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int length = sc.nextInt();
 long[] fibo = new long[length];
 fibo[0] = 0;
 fibo[1] = 1;
for (int i = 2; i < length; i++) {
fibo[i] = fibo[i - 1] + fibo[i - 2];
}
System.out.print(Arrays.toString(fibo));
 }
}