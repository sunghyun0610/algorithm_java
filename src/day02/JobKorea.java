//package day02;
//
//import java.util.ArrayList;
//import java.util.Scanner;
///**
// *
// * 구직자(속성 3개이상, 메서드 2개이상)
// * 구인회사(속성 3개이상, 메서 2개이상)
// */
///
//public class JobKorea {
//
//
//
//    public class JobKorea {
//        static ArrayList<Applicant> applicants = new ArrayList<>();
//        static ArrayList<Company> companies = new ArrayList<>();
//        static Scanner sc = new Scanner(System.in);
//        public static void showMenu() {
//            System.out.println("*****JobKorea App v1.1*****");
//            System.out.println("1. 구직자 등록");
//            System.out.println("2. 회사 등록");
//            System.out.println("3. 구직자 정보 출력 (All)");
//            System.out.println("4. 구직자 정보 검색 (이름)");
//            System.out.println("5. 구직자 정보 삭제 (연락처)");
//            System.out.println("9. 종   료");
//            System.out.println("***************************");
//            System.out.println("메뉴 번호를 선택하세요 =>");
//            System.out.println("***************************");
//
//        }
//
//        public static void registerApplicant() {
//            Applicant applicant = new Applicant();
//            applicant.showInput();
//            applicants.add(applicant);
//        }
//
//        public static void registerCompany() {
//            Company company = new Company();
//            company.showInput();
//            companies.add(company);
//        }
//
//        public static void printAllApplicants() {
//            for (Applicant applicant : applicants) {
//                applicant.printInfo();
//            }
//        }
//
//        public static void searchApplicant() {
//            String name = sc.next();
//            for (Applicant applicant : applicants) {
//                if (applicant.getName().equals(name)) {
//                    applicant.printInfo();
//                    return;
//                }
//            }
//            System.out.println("구직자가 존재하지 않습니다");
//        }
//
//        public static void deleteApplicant() {
//            String name = sc.next();
//            for (Applicant applicant : applicants) {
//                if (applicant.getName().equals(name)) {
//                    applicants.remove(applicant);
//                    return;
//                }
//            }
//            System.out.println("구직자가 존재하지 않습니다.");
//        }
//
//        public static void main(String[] args) {
//            while (true) {
//                showMenu();
//                int menu = sc.nextInt();
//                switch (menu) {
//                    case 1:
//                        registerApplicant();
//                        break;
//                    case 2:
//                        registerCompany();
//                        break;
//                    case 3:
//                        printAllApplicants();
//                        break;
//                    case 4:
//                        searchApplicant();
//                        break;
//                    case 5:
//                        deleteApplicant();
//                        break;
//                    case 9:
//                        System.out.println("프로그램을 종료합니다.");
//                        return;
//                    default:
//                        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
//                }
//            }
//        }
//    }
//}
