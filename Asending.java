import  java.util.*;
public class Asending{
public static  void main(String[] args){
Scanner sc =  new  Scanner(System.in);
System.out.println("Enter the array size");
int n = sc.nextInt();
int i,j;
int arr[] = new  int[n];
for( i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for( i=1;i<arr.length-1;i++){
for( j=1;j<arr.length-1-i;j++){
if(arr[i]>arr[j]){
int temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
System.out.println("Array elements are");
for(  i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}
}



