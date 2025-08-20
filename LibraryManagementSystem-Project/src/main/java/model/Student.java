
package model;

public class Student {
    private String studentId ;
    private String studentName ;
    private String studentRollNumber ;
    private int bookId;

    public Student(String studentId, String studentName, String studentRollNumber, int bookId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentRollNumber = studentRollNumber;
        this.bookId = bookId ;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(String studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }
    
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentRollNumber='" + studentRollNumber + '\'' +
                ", bookId='"+ bookId + '\''+
                '}';
    }    
}
