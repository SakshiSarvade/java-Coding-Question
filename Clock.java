import java.util.*;
public class Clock{
public static void main(String[] args){
String s1  = "01:25:45  PM";
int hour  =Integer.parseInt(hours1);
String hours1= s1.split(":")[0];
if(s1.contains("P")){
hour +=12;
System.out.println(hour);
}
}
}