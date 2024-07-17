package my.library;

import java.util.Scanner;

public class LibraryApp {
    private static Library library = new Library();
    private static Scanner sc =new Scanner(System.in);


    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addRegularBook();
                    break;
                case 2:
                    addReferenceBook();
                    break;
                case 3:
                    library.printAllBooks();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    library.printAllRentalRecords();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private static void printMenu() {
        System.out.println("=== Library System Menu ===");
        System.out.println("1. Regular Book 등록");
        System.out.println("2. Reference Book 등록");
        System.out.println("3. 모든 도서 출력");
        System.out.println("4. 도서 대여하기");
        System.out.println("5. 대여된 모든 도서목록 보기");
        System.out.println("6. 종료");
        System.out.println("===========================");
        System.out.print("메뉴 번호를 선택하세요: ");
    }
    private static void addRegularBook() {
        System.out.println("===========================");
        System.out.print("일반도서 제목 입력: ");
        String title = sc.nextLine();
        System.out.print("일반도서 저자 입력: ");
        String author = sc.nextLine();

        GeneralBook book = new GeneralBook(title, author);
        library.addBook(book);
        System.out.println("일반도서 목록에 추가되었어요: " + title);


    }

    private static void addReferenceBook() {
        System.out.println("===========================");
        System.out.print("일반도서 제목 입력: ");
        String title = sc.nextLine();
        System.out.print("일반도서 저자 입력: ");
        String author = sc.nextLine();

        ReferenceBook book= new ReferenceBook(title,author);
        library.addBook(book);
        System.out.println("참고도서 목록에 추가되었어요: " + title);


    }

    private static void borrowBook(){
        System.out.println("===========================");
        System.out.print("memberId 입력: ");
        String memberId = sc.nextLine();//memberId 입력
        System.out.println("대여할 도서 제목 입력: ");
        String title =sc.next();

        boolean borrowed = false;
        for (Book book : library.books) {
            if (book.getTitle().equals(title) && book instanceof Borrowable) {
                ((Borrowable) book).borrow(memberId, library);
                borrowed = true;
                System.out.println("대여 도서 : " + title + ", 대여한 회원 번호: " + memberId);
                break;
            }
        }

        if (!borrowed) {
            System.out.println("해당 도서는 유효하지 않습니다.");
        }
    }


    //그 책이 도서관에 있어서 대여가능한지 조회하는 로직
}
