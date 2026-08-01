import java.util.*;
import java.util.stream.*;

class Book {

    int bookId;
    String title;
    String author;
    double price;

    Book(int id, String t, String a, double p) {
        bookId = id;
        title = t;
        author = a;
        price = p;
    }

    public String toString() {
        return title;
    }
}

public class Collectors1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Book> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String title = sc.next();
            String author = sc.next();
            double price = sc.nextDouble();

            list.add(new Book(id, title, author, price));
        }

        Map<String, List<Book>> map =
                list.stream()
                    .collect(Collectors.groupingBy(b -> b.author));

        System.out.println(map);

        sc.close();
    }
}