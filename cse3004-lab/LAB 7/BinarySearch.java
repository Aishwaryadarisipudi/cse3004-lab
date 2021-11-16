import java.util.*;
class BinarySearch {
 int binarySearch(int arr[], int l, int r, int x)
 {
 if (r >= l) {
 int mid = l + (r - l) / 2;
 if (arr[mid] == x)
 return mid;
 if (arr[mid] > x)
 return binarySearch(arr, l, mid - 1, x);
 return binarySearch(arr, mid + 1, r, x);
 }
 return -1;
 }
 // Driver method
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 BinarySearch ob = new BinarySearch();
 System.out.println("Enter the size of array to be searched");
 int n = sc.nextInt();
 int[] arr = new int[n];
 System.out.println("Enter the values of array to be searched");
 for(int i=0;i<n;i++){
 arr[i] = sc.nextInt();
 }
 System.out.println();
 for(int j=0;j<n;j++){
 System.out.print(" "+arr[j]);;
 }
 System.out.println(" ");
 System.out.println("Enter the size of key array");
 int n1 = sc.nextInt();
 int result =0;
 int[] key = new int[n1];
 System.out.println("Enter the values of key array");
 for(int i=0;i<n;i++){
 key[i] = sc.nextInt();
 }
 System.out.println("Result:");
 for(int i=0;i<n;i++){
 result = ob.binarySearch(arr, 0, n - 1, key[i]);
 if (result == -1)
 System.out.print(" -1");
 else
 System.out.print(" 0");
 }
 sc.close();
}
}