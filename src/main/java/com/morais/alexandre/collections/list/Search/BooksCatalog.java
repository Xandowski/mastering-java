package list.Search;

import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    private List<Book> books;

    public BooksCatalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author, int year){
        books.add(new Book(title, author, year));
    }

    public void findByAuthor(String author){}

    public void findByYearInterval(){}
}
