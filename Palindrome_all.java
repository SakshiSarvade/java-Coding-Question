public class Palindrome_all {
    public static void main(String[] args) {
        System.out.println("Palindrome number from 1 to 100 are");
        int num = 1;
        while(num<100){

        int rev =  0;
        int n1=num;
        while (num>0)
        {
           int d=num%10;
           rev =rev*10+d;
           num  = num/10;
        }
        if (rev==n1){
            System.out.println(n1);
        }
        num=n1;
        num++;
         }   
        }
        }