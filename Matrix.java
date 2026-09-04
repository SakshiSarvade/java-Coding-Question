public class Matrix{
public static void main(String[] args){
int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
int t =4;
int c = 0;
for(int  i=0;i<matrix.length;i++){
for(int j=0;j<matrix[i].length;j++){
if(t==matrix[i][j]){
c++;
}
}
if(c==0)
{
System.out.println("false");
}
else
{
System.out.println("True");
}
}
}
}
