import java.util.Scanner;
public class Triangle {
    public  static void main(String args[]){
    Scanner  sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of  b");
    int b =  sc.nextInt();
    System.out.println("Enter the value of  c");
    int c =  sc.nextInt();
    if(a==b && b==c)
        System.out.println("It is a equilateral triangle");
    else
        System.out.println("The Triangle is not equilateraltriangle");
    
    }  
}
