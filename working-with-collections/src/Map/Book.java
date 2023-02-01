package Map;

public class Book {
  String author;
  String bookName;
  int pages;

  public Book(String author, String bookName, int pages) {
    this.author = author;
    this.bookName = bookName;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

}
