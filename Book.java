class Book1{
    int bookid;
    String bookname;
    String authorname;
    int price;
    String publication;
    int pages;

    Book1(){
        bookid = 302;
        bookname = "Story book";
        authorname = "Sanjay patil";
        price = 250;
        publication = "Balbharati";
        pages = 70;
    }
    void putdata(){
        System.out.println("Book id = "+ bookid +  "\tBook name = " + bookname + "\tAuthorname = "+ authorname + "\tprice = "+ price + "\tPublication = "+ publication + "\tPages = "+ pages);
    }
}
public class Book {
    public static void main(String[] args) {
        Book1 b = new Book1();
        b.putdata(); 
    }   
}
