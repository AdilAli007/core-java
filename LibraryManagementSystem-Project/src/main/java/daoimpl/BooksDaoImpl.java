
package daoimpl;

import dao.BooksDao;
import database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Books;

public class BooksDaoImpl implements BooksDao {
    @Override
    public int addBook(Books book) {
        String sql = "INSERT INTO Books (book_id, book_name, book_isbn, author_name, quantity) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, book.getBookId());
            stmt.setString(2, book.getBookName());
            stmt.setString(3, book.getBookISBN());
            stmt.setString(4, book.getAuthorName());
            stmt.setInt(5, (int) book.getQuantity());
            return stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
        return 0;
    }  

    @Override
    public int updateBook(Books book) {
        String sql = "UPDATE Books SET quantity = ? WHERE book_id = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, (int) book.getQuantity());
        stmt.setInt(2, book.getBookId());
        return stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Error updating book: " + e.getMessage());
    }
    return 0; 
    }

    @Override
    public Books getBookById(int bookId) {
        String sql = "SELECT * FROM Books WHERE book_id = ?";
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, bookId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Books(
                rs.getInt("book_id"),
                rs.getString("book_name"),
                rs.getString("book_isbn"),
                rs.getString("author_name"),
                rs.getInt("quantity")
            );
        }
    } catch (SQLException e) {
        System.out.println("Error fetching book: " + e.getMessage());
    }
    return null;  
    }

    @Override
    public List<Books> getAllBooks() {
    List<Books> books = new ArrayList<>();
    String sql = "SELECT * FROM Books";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Books book = new Books(
                rs.getInt("book_id"),
                rs.getString("book_name"),
                rs.getString("book_isbn"),
                rs.getString("author_name"),
                rs.getInt("quantity")
            );
            books.add(book);
        }

    } catch (SQLException e) {
        System.out.println("Error fetching books: " + e.getMessage());
    }

    return books;
    }
    
 
  }

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

