import java.util.*;
class Student{
    int sid;
    String name;
    Student(int sid,String name){
        this.sid = sid;
        this.name = name;
    }
    void putdata(){
        System.out.println("sid = "+ this.sid +"name = "+ this.name);
    }
}
class Test extends Student{
    int m1;
    int m2;
    Test(int sid,String name,int m1,int m2){
        super(sid,name);
    this.m1=m1;
    this.m2=m2;
}
void putmarks(){
    System.out.println("m1:"+this.m1 +"m2:"+this.m2);
}
}
class Result extends Test{
    int  total;
    float per;
    Result(int sid,String name,int m1,int m2){
        super(sid,name,m1,m2);
    }
    void calculate()
    {
        total =  this.m1 + this.m2;
        per = total/2;
        System.out.println("total:"+total +"percent:"+per);
    }
}
public class Multilevel
{
    public static void main(String[] args) {
        int sid;
        String name;
        int m1;
        int  m2;
        System.out.println("Enter the sid,name,m1,m2");
        Scanner sc = new Scanner(System.in);
        sid = sc.nextInt();
        name =sc.next();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        Result r = new Result(sid,name,m1,m2);
            r.putdata();
            r.putmarks();
            r.calculate();
    }

}