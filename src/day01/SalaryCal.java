package day01;

// 급여를 계산하는 메서드
/*
급여 계산 로직:
근무 시간이 160시간을 초과하면 초과 근무 수당을 계산합니다.
근무 연수가 5년을 초과하면 기본 급여의 5%, 2년을 초과하면 기본 급여의 2%를 보너스로 추가합니다.
보너스가 있는 경우 추가로 $500을 급여에 더합니다.
*/

 class Employee{
     String name;
     double salary;
     int yearsOfWork;
     double hoursWork;
     boolean hasBouse;

     Employee(String name,double salary,int yearsOfWork,double hoursWork,boolean hasBouse){
         this.name=name;
         this.salary=salary;
         this.yearsOfWork=yearsOfWork;
         this.hoursWork=hoursWork;
         this.hasBouse=hasBouse;
     }
 }

public class SalaryCal {

     public void register(Employee e){
         //직원 등록


     }

     public double calculateSalary(Employee emp){
         //직원들 급여 계산 메서드
         double money= emp.salary;
         if(emp.yearsOfWork>160){
             money+=(emp.hoursWork-160)*0.5* emp.salary;
         }
         if(emp.yearsOfWork>5){
             money+= emp.salary*1.05;
         }
         else if(emp.yearsOfWork>2){
             money+= emp.salary*1.02;
         }

         if(emp.hasBouse){
             money+=500;
         }
         return money;
     }

    public static void main(String[] args) {
         Employee employee1= new Employee("우성",150.0,3,200,true);

    }
}
