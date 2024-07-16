package day01;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;



public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> scores = new HashMap<>();
        scores.put("성현",100);
        scores.put("상진",50);
        scores.put("승철",70);
        scores.put("우성",90);
        scores.put("하용",30);
        calculateGrade(scores);

    }
// 오버로딩은 동일한 이름의 메서드를 서로 다른 매개변수 목록으로 정의하는 것입니다.
    public static void calculateGrade(Map<String, Integer> scores) {
        for (String key : scores.keySet()) {
            String name = key;
            int originalScore = scores.get(key);
            int bonusScore = calculateBonus(originalScore);
            String grade = calculateGrade(originalScore);//메서드 오버로딩

            System.out.printf("학생: %s, 원점수: %d, 보너스 점수: %d, 학점: %s\n",
                    name, originalScore, bonusScore, grade);
        }
    }
    public static int calculateBonus(int score) {
        if (score >= 90) {
            return 10;
        } else if (score >= 80) {
            return 5;
        } else if (score >= 70) {
            return 2;
        } else {
            return 0;
        }
    }

    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

/*
학생 점수 데이터:
Map<String, Integer>를 사용하여 학생의 이름과 점수를 저장합니다.
학점 계산:

calculateGrade 메서드는 점수를 받아 학점을 계산합니다.
if-else 문을 사용하여 점수 범위에 따라 학점을 반환합니다.
보너스 점수 적용:

점수가 높은 학생일수록 더 많은 보너스를 받습니다.
예를 들어, 90점 이상인 경우 10점, 80점 이상인 경우 5점, 70점 이상인 경우 2점을 보너스로 받습니다.
보너스 점수가 적용된 경우 학점에 추가 설명을 붙입니다.
출력:

각 학생의 이름, 원래 점수, 보너스 점수 및 학점을 출력합니다.
*/