package day01;

public class Member {
    int no;//회원번호 iv 인스턴스 변수
    String name;
    String tel;
    // 기본 생성자
    public Member() {}

    // 매개변수가 있는 생성자
    public Member(int no, String name, String tel) {
        this.no = no;
        this.name = name;
        this.tel = tel;
    }//생성자가 있어야함 ! 매개변수를 받는 생성자가 정의되지 않았기 때문입니다.

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "Member { " +
                "no=" + no +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                " }";
    }


    public static void main(String[] args) {
        Member member1=new Member();
        member1.no=1;
        member1.name="성현";
        member1.tel="010";
        Member member2=new Member();
        member2.no=2;
        member2.name="성훈";
        member2.tel="011";
        Member member3=new Member(3,"재준","012");
        Member [] members={member1,member2,member3};


        for(Member member : members){
            System.out.println(member);
        }

    }
}
