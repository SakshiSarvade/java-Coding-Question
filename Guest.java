import  java.util.*;
public class Guest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
int[] E = new int[T];
int[] L = new int[T];
for(int i=0;i<T;i++){
E[i]=sc.nextInt();
}
for(int i=0;i<T;i++){
L[i]=sc.nextInt();
}
int currentguest=0;
int maxguest=0;
for(int  i=0;i<T;i++){
currentguest=currentguest+E[i]-L[i];
if(currentguest>maxguest){
maxguest=currentguest;
}
System.out.println(maxguest);
}
}
}