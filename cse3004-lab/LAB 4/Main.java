import java.util.*;
public class Main {
 public static void addDigit(int x, List<Integer> list){
 int temp = 0;
 if(x<10)
 list.add(x);
 else{
 for(int i=0;i<x;i++){
 temp = x%10;
 list.add(temp);
 x = x/10;
 }
 }
 }
 public static void main(String[] args) throws Exception {
List<Integer> list = new ArrayList<>();
 
 
 addDigit(53,list);
 addDigit(9, list);
 addDigit(88, list);
 addDigit(568, list);
 
 Collections.sort(list, Collections.reverseOrder());
 
 
 System.out.println("Highest salary possible with the given number is "+list);
 }
}

