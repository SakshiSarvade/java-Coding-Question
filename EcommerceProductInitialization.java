//extra program//
public class EcommerceProductInitialization{
    int  id;
    String name;
    int prize;
    int  quantity;
      
     EcommerceProductInitialization(int  id,String name,int prize,
     int  quantity){
    this.id = id;
    this.name = name;
    this.prize = prize;
    this.quantity = quantity;
 }
void display(){
    System.out.println("Product id"  +  id);
    System.out.println("Product name"  +  name);
    System.out.println("Product prize"  +  prize);
    System.out.println("Product quantity"  +  quantity);
}

public static void main(String[] args){
    EcommerceProductInitialization e1 = new EcommerceProductInitialization(101,"laptop",80000,1);
    EcommerceProductInitialization e2 = new EcommerceProductInitialization(102,"headphone",3000,2);
    EcommerceProductInitialization e3 = new  EcommerceProductInitialization(103,"cable",1000,1);
    e1.display();
    e2.display();
    e3.display();
}
}
