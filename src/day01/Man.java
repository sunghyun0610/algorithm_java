package day01;

public class Man {
    String department;
    public Man() {
        this.department = department;
    }
    public Man(String department) {
        this.department = department;
    }

}

class BusinessMan extends Man{
    String name;
    String position;

    public BusinessMan(String name, String position, String department) {
        super(department);
        this.name = name;
        this.position = position;
    }

    public BusinessMan(String name, String position) {
        super("소프트웨어공학과");
        this.name = name;
        this.position = position;
    }

}

class BasicInheritance{
    public static void main(String[] args) {
        BusinessMan man1= new BusinessMan("Mr. Hong","학생","멀티미디어 공학과");
        System.out.println(man1.department);

        BusinessMan man2 =new BusinessMan("MR Lee", "교수");
        System.out.println(man2.department);
    }

}
