import java.util.*;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer>list  = Arrays.asList(10,15,20,25,30);


        list.stream()
        .filter(n->n > 20)
        .forEach(System.out::println);
    }
}
