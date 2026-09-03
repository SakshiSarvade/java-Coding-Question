import java.util.*;
public class Result{
public static void  main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the Array elements");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int count =1;
int max=arr[0];
for(int i=0;i<n;i++){
if(arr[i]>max){
count++;
 max=arr[i];
}
}
System.out.println("The total max values are"+count);
}
}