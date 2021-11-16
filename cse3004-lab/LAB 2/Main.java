class Main {
public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){
 int i=0,b=0,c = 0;
 while(b<left_size && c<right_size){
 if(left_arr[b]<right_arr[c]){
 arr[i++] = left_arr[b++];
 }
 else{
 arr[i++] = right_arr[c++];
 }
 }
 while(b<left_size){
 arr[i++] = left_arr[b++];
 }
 while(c<right_size){
 arr[i++] = right_arr[c++];
 }
}
 public static void mergeSort(int [] arr, int len){
 if (len < 2){return;}
 int mid = len / 2;
 int [] left_arr = new int[mid];
 int [] right_arr = new int[len-mid];
 int s = 0;
 for(int i = 0;i<len;++i){
 if(i<mid){
 left_arr[i] = arr[i];
 }
 else{
 right_arr[s] = arr[i];
 s = s+1;
 }
 }
 mergeSort(left_arr,mid);
 mergeSort(right_arr,len-mid);
 merge(left_arr,right_arr,arr,mid,len-mid);
 }
 public static void main( String args[] ) {
 int [] array = {11,2,10,50,6,12,45};
 mergeSort(array,array.length);
 for(int i =0; i< array.length;++i){
System.out.print(array[i]+ " ");
 }
 }
}