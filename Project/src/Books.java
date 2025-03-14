import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Books {
    private String bookId ;
    private String bookName ;
    private String bookISBN ;
    private String authorName ;
    private long quantity ;

    public Books(String bookId, String bookName, String bookISBN, String authorName, long quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookISBN = bookISBN;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public Books() {

    }


    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                ", authorName='" + authorName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
