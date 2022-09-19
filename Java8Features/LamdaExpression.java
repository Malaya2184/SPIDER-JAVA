import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class Book{
    private Integer id;
    private String name;
    private String author;
    private int price;

    public Book() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Book(Integer id, String name, String author, int price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String toString(){
        return "Book = id =" + this.id + "name =" + this.name + "author =" + this.author + "price =" + this.price;
    }
}

class MyCompare implements Comparator{

    @Override
    public int compare(Object b1, Object b2) {
        Book x = (Book) b1;
        Book y = (Book) b2;
        return -x.getName().compareTo(y.getName());
    }
    
}

public class LamdaExpression {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(9, "mybook 1", "zuthor 9", 100));
        books.add(new Book(8, "mybook 2", "yuthor 8", 200));
        books.add(new Book(7, "mybook 3", "xuthor 7", 300));
        books.add(new Book(6, "mybook 4", "wuthor 6", 400));
        books.add(new Book(5, "mybook 5", "vuthor 5", 500));
        books.add(new Book(4, "mybook 6", "uuthor 4", 600));
        return books;
    }
    public static void main(String[] args) {
        
        List<Book> books = new LamdaExpression().getBooks();
        // Collections.sort(books, new MyCompare());
        // Collections.sort(books, (b1,b2)-> -b1.getName().compareTo(b2.getName()));
        Collections.sort(books, (b1,b2)-> b1.getId().compareTo(b2.getId()));
        System.out.println(books);

        System.out.println(Integer.valueOf(1).compareTo(1));
        System.out.println(compare);

    }
}
