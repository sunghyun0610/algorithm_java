package my.library;

import java.time.LocalDate;

public class RentalRecord {
    protected String bookTitle;
    protected String memberId;
    protected LocalDate borrowDate;

    public RentalRecord(String bookTitle, String memberId, LocalDate borrowDate) {
        this.bookTitle = bookTitle;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
    }

    public void printRecord(){
        System.out.println("Borrowd Record - " +"Member ID: " + memberId + " Book Title: " + bookTitle + "Borrow Date: " + borrowDate);
    }


}
