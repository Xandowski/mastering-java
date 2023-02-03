package Map;

import java.util.Comparator;
import java.util.Map;

public class Book implements Comparable<Book> {
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((author == null) ? 0 : author.hashCode());
    result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
    result = prime * result + pages;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    if (author == null) {
      if (other.author != null)
        return false;
    } else if (!author.equals(other.author))
      return false;
    if (bookName == null) {
      if (other.bookName != null)
        return false;
    } else if (!bookName.equals(other.bookName))
      return false;
    if (pages != other.pages)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Book: {author=" + author + ", bookName=" + bookName + ", pages=" + pages + "}";
  }

  @Override
  public int compareTo(Book book) {
    int pages = Integer.compare(this.getPages(), book.getPages());

    if (pages != 0)
      return pages;

    int author = this.getAuthor().compareTo(book.getAuthor());

    if (author != 0)
      return author;

    return this.getBookName().compareTo(book.getBookName());
  }
}

class BookNameComparator implements Comparator<Map.Entry<String, Book>> {
  @Override
  public int compare(Map.Entry<String, Book> b1, Map.Entry<String, Book> b2) {
    return b1.getValue().getBookName().compareToIgnoreCase(b2.getValue().getBookName());
  }
}
