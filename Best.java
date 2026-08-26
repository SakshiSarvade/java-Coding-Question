public class Best{
public static void main(String[] args){
int[] arr = {50,20,70,40,90,60};
int n = arr.length;
int k = 3;
int[] temp = new int[n];
for(int i=0;i<n;i++){
temp[i]=arr[i];
}
for(int i=0;i<n-1;i++){
for(int j=0;j<n-i-1;j++){
if(temp[j] < temp[j+1]){
int t = temp[j];
temp[j] = temp[j+1];
temp[j+1] = t;
}
}
}
System.out.println(temp[k-1]);
}
}
