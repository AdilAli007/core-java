
package main;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Books;
import model.Student;
import service.BookService;
import service.StudentService;
import serviceimpl.BookServiceImpl;
import serviceimpl.StudentServiceImpl;

public class MainGui extends javax.swing.JFrame {

    private final BookService bookService = new BookServiceImpl();
    private final StudentService studentService = new StudentServiceImpl();
    
    private JTable booksTable;
    private DefaultTableModel booksModel;

    private JTable studentsTable;
    private DefaultTableModel studentsModel;
    
    private JTextField abId;
    private JTextField abName;
    private JTextField abIsbn;
    private JTextField abAuthor;
    private JSpinner  abQty;
    
    private JTextField ibStudentId;
    private JTextField ibStudentName;
    private JTextField ibRollNo;
    private JSpinner  ibBookId;
    
    private JTextField rbStudentId;
    
    

    
    public MainGui() {
        super("Library Management System");
        initComponents();
        setContentPane(new GradientPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(980, 640));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JLabel title = new JLabel("Library Management System", SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(title.getFont().deriveFont(Font.BOLD, 26f));
        title.setBorder(new EmptyBorder(16, 16, 8, 16));
        add(title, BorderLayout.NORTH);
        
                JTabbedPane tabs = new JTabbedPane();
        tabs.setBorder(new EmptyBorder(8, 8, 8, 8));
        tabs.setFocusable(false);
        tabs.setFont(tabs.getFont().deriveFont(Font.BOLD, 14f));

        tabs.addTab("Add Book", buildAddBookTab());
        tabs.addTab("Issue Book", buildIssueBookTab());
        tabs.addTab("Return Book", buildReturnBookTab());
        tabs.addTab("Books", buildBooksTab());
        tabs.addTab("Students", buildStudentsTab());

        add(tabs, BorderLayout.CENTER);

        refreshBooksTable();
        refreshStudentsTable();
        
    }
    
     private JPanel buildAddBookTab() {
        JPanel p = makeCardPanel();

        abId = new JTextField();
        abName = new JTextField();
        abIsbn = new JTextField();
        abAuthor = new JTextField();
        abQty = new JSpinner(new SpinnerNumberModel(1, 0, 1_000_000, 1));

        JButton btnAdd = primaryButton("Add Book");
        btnAdd.addActionListener(e -> onAddBook());

        JPanel form = formGrid(
                label("Book ID"), abId,
                label("Name"), abName,
                label("ISBN"), abIsbn,
                label("Author"), abAuthor,
                label("Quantity"), abQty,
                new JLabel(), btnAdd
        );

        p.add(form);
        return p;
    }
     
         private JPanel buildIssueBookTab() {
        JPanel p = makeCardPanel();

        ibStudentId = new JTextField();
        ibStudentName = new JTextField();
        ibRollNo = new JTextField();
        ibBookId = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));

        JButton btnIssue = primaryButton("Issue Book");
        btnIssue.addActionListener(e -> onIssueBook());

        JPanel form = formGrid(
                label("Student ID"), ibStudentId,
                label("Student Name"), ibStudentName,
                label("Roll No"), ibRollNo,
                label("Book ID"), ibBookId,
                new JLabel(), btnIssue
        );

        p.add(form);
        return p;
    }
         
        private JPanel buildReturnBookTab() {
        JPanel p = makeCardPanel();

        rbStudentId = new JTextField();

        JButton btnReturn = primaryButton("Return Book");
        btnReturn.addActionListener(e -> onReturnBook());

        JPanel form = formGrid(
                label("Student ID"), rbStudentId,
                new JLabel(), btnReturn
        );

        p.add(form);
        return p;
    }
        
        private JPanel buildBooksTab() {
        JPanel p = makeCardPanel();

        booksModel = new DefaultTableModel(
                new Object[]{"ID", "Name", "ISBN", "Author", "Quantity"}, 0
        ) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        booksTable = niceTable(booksModel);

        JButton refresh = secondaryButton("Refresh");
        refresh.addActionListener(e -> refreshBooksTable());

        JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 8));
        top.setOpaque(false);
        top.add(refresh);

        p.setLayout(new BorderLayout(8, 8));
        p.add(top, BorderLayout.NORTH);
        p.add(new JScrollPane(booksTable), BorderLayout.CENTER);
        return p;
    }
        
        private JPanel buildStudentsTab() {
        JPanel p = makeCardPanel();

        studentsModel = new DefaultTableModel(
                new Object[]{"Student ID", "Name", "Roll No", "Book ID"}, 0
        ) {
            @Override public boolean isCellEditable(int r, int c) { return false; }
        };
        studentsTable = niceTable(studentsModel);

        JButton refresh = secondaryButton("Refresh");
        refresh.addActionListener(e -> refreshStudentsTable());

        JPanel top = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 8));
        top.setOpaque(false);
        top.add(refresh);

        p.setLayout(new BorderLayout(8, 8));
        p.add(top, BorderLayout.NORTH);
        p.add(new JScrollPane(studentsTable), BorderLayout.CENTER);
        return p;
    }
         
        private void onAddBook() {
        try {
            int id = parseInt(abId.getText(), "Book ID");
            String name = mustText(abName.getText(), "Name");
            String isbn = mustText(abIsbn.getText(), "ISBN");
            String author = mustText(abAuthor.getText(), "Author");
            int qty = (int) abQty.getValue();

            Books b = new Books(id, name, isbn, author, qty);
            bookService.addBook(b);
            info("Book added successfully.");
            refreshBooksTable();
            clearAddBookForm();
        } catch (IllegalArgumentException ex) {
            warn(ex.getMessage());
        } catch (Exception ex) {
            error("Failed to add book: " + ex.getMessage());
        }
    }
        
        private void onIssueBook() {
        try {
            String sid = mustText(ibStudentId.getText(), "Student ID");
            String sname = mustText(ibStudentName.getText(), "Student Name");
            String roll = mustText(ibRollNo.getText(), "Roll No");
            int bookId = (int) ibBookId.getValue();

            boolean ok = bookService.issueBook(bookId);
            if (!ok) {
                warn("Book not available or not found.");
                return;
            }
            Student s = new Student(sid, sname, roll, bookId);
            int added = 0;
try {
    added = studentService.addStudent(s);
} catch (Exception e) {
    error("DB Insert failed: " + e.getMessage());
    bookService.returnBook(bookId);
    return;
}

if (added <= 0) {
    warn("Student not saved (no rows affected).");
    bookService.returnBook(bookId);
    return;
} 
            info("Book issued to " + sname + ".");
            refreshBooksTable();
            refreshStudentsTable();
            clearIssueBookForm();
        } catch (IllegalArgumentException ex) {
            warn(ex.getMessage());
        } catch (Exception ex) {
            error("Error issuing book: " + ex.getMessage());
        }
    }    
        
        private void onReturnBook() {
        try {
            String sid = mustText(rbStudentId.getText(), "Student ID");
            Student s = studentService.getStudentById(sid);
            if (s == null) {
                warn("Student not found.");
                return;
            }
            int bookId = s.getBookId();
            bookService.returnBook(bookId);
            studentService.deleteStudent(sid);
            info("Book returned successfully.");
            refreshBooksTable();
            refreshStudentsTable();
            rbStudentId.setText("");
        } catch (IllegalArgumentException ex) {
            warn(ex.getMessage());
        } catch (Exception ex) {
            error("Error returning book: " + ex.getMessage());
        }
    }    

     private void refreshBooksTable() {
        SwingUtilities.invokeLater(() -> {
            clearTable(booksModel);
            List<Books> list = bookService.showAllBooks();
            for (Books b : list) {
                booksModel.addRow(new Object[]{
                        b.getBookId(), b.getBookName(), b.getBookISBN(), b.getAuthorName(), b.getQuantity()
                });
            }
        });
    }
     
         private void refreshStudentsTable() {
        SwingUtilities.invokeLater(() -> {
            clearTable(studentsModel);
            List<Student> list = studentService.showAllStudents();
            for (Student s : list) {
                studentsModel.addRow(new Object[]{
                        s.getStudentId(), s.getStudentName(), s.getStudentRollNumber(), s.getBookId()
                });
            }
        });
    }

      private void clearTable(DefaultTableModel m) {
        m.setRowCount(0);
    }
      
        private void clearAddBookForm() {
        abId.setText("");
        abName.setText("");
        abIsbn.setText("");
        abAuthor.setText("");
        abQty.setValue(1);
    }
        
     private void clearIssueBookForm() {
        ibStudentId.setText("");
        ibStudentName.setText("");
        ibRollNo.setText("");
        ibBookId.setValue(0);
    }
     
        private int parseInt(String s, String field) {
        try {
            return Integer.parseInt(s.trim());
        } catch (Exception e) {
            throw new IllegalArgumentException(field + " must be a number.");
        }
    }
        
        private String mustText(String s, String field) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " is required.");
        }
        return s.trim();
    }

    private JLabel label(String text) {
        JLabel l = new JLabel(text);
        l.setForeground(new Color(245, 245, 245));
        l.setFont(l.getFont().deriveFont(Font.BOLD, 14f));
        return l;
    }

    private JPanel formGrid(Component... comps) {
        JPanel p = new JPanel(new GridBagLayout());
        p.setOpaque(false);
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(8, 8, 8, 8);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.weightx = 1;

        for (int i = 0; i < comps.length; i += 2) {
            gc.gridx = 0; gc.gridy = i;
            p.add(comps[i], gc);
            gc.gridx = 1; gc.gridy = i;
            p.add(comps[i + 1], gc);
        }
        return p;
    }

    private JButton primaryButton(String text) {
        JButton b = new JButton(text);
        b.setBackground(new Color(66, 133, 244));
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setFont(b.getFont().deriveFont(Font.BOLD, 14f));
        b.setBorder(BorderFactory.createEmptyBorder(10, 16, 10, 16));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return b;
    }

    private JButton secondaryButton(String text) {
        JButton b = new JButton(text);
        b.setBackground(new Color(52, 168, 83));
        b.setForeground(Color.WHITE);
        b.setFocusPainted(false);
        b.setFont(b.getFont().deriveFont(Font.BOLD, 13f));
        b.setBorder(BorderFactory.createEmptyBorder(8, 14, 8, 14));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return b;
    }

    private JPanel makeCardPanel() {
        JPanel card = new JPanel();
        card.setOpaque(false);
        card.setLayout(new GridBagLayout());
        JPanel inner = new JPanel(new BorderLayout(8, 8));
        inner.setOpaque(false);
        inner.setBorder(new EmptyBorder(16, 16, 16, 16));
        card.add(inner, new GridBagConstraints());
        return inner;
    }

    private JTable niceTable(DefaultTableModel model) {
        JTable t = new JTable(model);
        t.setRowHeight(26);
        t.setFillsViewportHeight(true);
        t.getTableHeader().setReorderingAllowed(false);
        t.getTableHeader().setFont(t.getTableHeader().getFont().deriveFont(Font.BOLD, 13f));
        t.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        return t;
    }

    private void info(String msg)  { JOptionPane.showMessageDialog(this, msg, "Info", JOptionPane.INFORMATION_MESSAGE); }
    private void warn(String msg)  { JOptionPane.showMessageDialog(this, msg, "Warning", JOptionPane.WARNING_MESSAGE); }
    private void error(String msg) { JOptionPane.showMessageDialog(this, msg, "Error", JOptionPane.ERROR_MESSAGE); }

    
    private static class GradientPanel extends JPanel {
        @Override protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            int w = getWidth(), h = getHeight();
            GradientPaint gp = new GradientPaint(
                    0, 0, new Color(32, 82, 149),
                    0, h, new Color(21, 151, 126)
            );
            g2.setPaint(gp);
            g2.fillRect(0, 0, w, h);
            g2.dispose();
        }
    }    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
         SwingUtilities.invokeLater(() -> new MainGui().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
