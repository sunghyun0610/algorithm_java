package ws;

import java.util.ArrayList;
import java.util.List;

// 오늘의 실습1 : 객체배열로 데이터 저장
// 오늘의 실습2 : ArrayList<Book> 또는 LinkedList<Book> 저장
// 오늘의 실습3 : Map을 활용하여 데이터 저장
public class BookManagerImpl implements IBookManager {


    // 클래스내에 생성자가 하나라도 존재하면 컴파일러는 기본생성자를 끼워넣지 않음
    // 이제 다른 클래스에서 new BookManagerImpl을 못하는 상태가 되었음.
    private BookManagerImpl() {
        books = new Book[SIZE];
    }

    static int cnt=0;



    private static BookManagerImpl instance = new BookManagerImpl();
    public static BookManagerImpl getInstance() {
        return instance;
    }

    @Override
    public void add(Book book) {
        if (cnt < SIZE) {
            books[cnt++] = book;
        } else {
            System.out.println("The book list is full.");
        }
    }

    @Override
    public void remove(String isbn){
        for(int i=0; i<cnt;i++){
            if(books[i].getIsbn().equals(isbn)){
                books[i]=books[cnt-1];
                books[cnt-1]=null;
                cnt--;
                break;
            }
        }
    }

    @Override
    public Book[] getList() {
        Book[] bookList = new Book[cnt];
        System.arraycopy(books, 0, bookList, 0, cnt);
        return bookList;
    }

    @Override
    public Book searchByIsbn(String isbn){
        for(Book book : books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }return null;
    }
    @Override
    public Book[] searchByTitle(String title){
        Book[] titleBooks = new Book[cnt];
        int tmp=0;
        for(int i=0;i<cnt;i++){
            if(books[i].getTitle().contains(title)){
                titleBooks[tmp]=books[i];
                tmp++;
            }
        }
        Book[] result = new Book[tmp];
        System.arraycopy(titleBooks, 0, result, 0, tmp);
        return result;
    }

    @Override
    public Magazine[] getMagazines(){
        Magazine[] magazines = new Magazine[cnt];//책이 아닌 잡지만 저장
        int tmp=0;
        for(int i=0;i<cnt;i++){
            if(books[i] instanceof Magazine){
                magazines[tmp]=(Magazine)books[i];
                tmp++;
            }
        }
        Magazine[] result = new Magazine[tmp];
        System.arraycopy(magazines, 0, result, 0, tmp);
        return result;

    }


    @Override
    public Book[] getBooks(){
        Book[] pureBooks = new Book[cnt];
        int tmp=0;//인덱스 체크해야되니까
        for(int i=0;i<cnt;i++){
            if(books[i] instanceof Book && !(books[i] instanceof Magazine)){
                pureBooks[tmp++]=(Book) books[i];
            }
        }
        Book[] result = new Book[tmp];
        System.arraycopy(pureBooks, 0, result, 0, tmp);
        return result;
    }


    @Override
    public int getTotalPrice(){
        int totalPrice=0;
        for(int i=0;i<cnt;i++){
            totalPrice+=books[i].getPrice();
        }
        return totalPrice;
    }

    @Override
    public double getPriceAvg(){
        //cnt==0인경우 예외처리 해야댐.
        double avgPrice=0;
        for(int i=0;i<cnt;i++){
            avgPrice+=books[i].getPrice();
        }
        avgPrice/=cnt;
        return avgPrice;
    }


    @Override
    public void sell(String isbn, int quantity)throws QuantityException,ISBNNotFoundException{
        for(int i=0;i<cnt;i++){
            if(books[i].getIsbn().equals(isbn)){
              if(books[i].getQuantity()<=quantity){
                  throw new QuantityException();//재고가 판매수량보다 적으면
              }
              else{
                  int num=books[i].getQuantity();
                  num-=quantity;
                  books[i].setQuantity(num);//메서드로 값 접근(캡슐화)
              }

            }
            return;
        }
        throw new QuantityException();
    }


    @Override
    public void buy(String isbn, int quantity) throws ISBNNotFoundException{
        for(int i=0;i<cnt;i++){
            if(books[i].getIsbn().equals(isbn)){
                int numOfBook=books[i].getQuantity();
                numOfBook+=quantity;
                books[i].setQuantity(numOfBook);
                return;
            }

        }
        throw new ISBNNotFoundException(isbn);
    }

    ////////////////////////////////////////////////////////////////////////////////
    private static final int SIZE = 100;
    private Book[] books;
	private List<Book> Listbooks;
//	private Map<String, Book> books;
}