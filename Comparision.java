import java.util.*;
public class Comparision {
    public  static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name,roll no,marks of three subject");
    String name = sc.next();
    int rollno = sc.nextInt();
    int m1 = sc.nextInt();
    int m2 = sc.nextInt();
    int m3 = sc.nextInt();
    int total  = m1+m2+m3;
    float perc= total/3;
    System.out.println("percentage is "+ perc);
    if (perc >=70){
        System.out.println("passed with destinction");
    }
    else if(perc >=60){
        System.out.println("passed with first class");
    }
    else if(perc >=50){
        System.out.println("passed with second class");
    }
    else if(perc >=40){
        System.out.println("passed in exam");
    }
    else {
        System.out.println("Fail");
    }
    }
    }

