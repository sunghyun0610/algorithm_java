package my.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<RentalRecord> borrowRecords =new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void printAllBooks(){
        for(Book book : books){
            book.printInfo();//전체 책 조회됨.
        }
    }

    public void rentalBook(Borrowable book, String memberId) {
        RentalRecord record = new RentalRecord(((Book)book).title, memberId, LocalDate.now());
        borrowRecords.add(record);
    }

    public void printAllRentalRecords(){
        for(RentalRecord rentalRecord : borrowRecords){
            rentalRecord.printRecord();
        }
    }


}
