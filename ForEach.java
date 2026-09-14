import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Java","Python","c++");

        list.stream().forEach(System.out::println);
    }
}
