import java.util.Scanner;

public class Socing_Problems_Dokyeong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("1. Python에서 변수를 선언하는 방법은? (점수: 10점)");
        System.out.println("1) var name 2) name = value 3) set name 4) name == value");
        int answer1 = sc.nextInt();
        System.out.println("-정답 :" + answer1);
        if (answer1 == 2) {
            total+= 10;
        }
        System.out.println("2. Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        System.out.println("1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 \n" +
                "상태로 유지된다");
        int answer2 = sc.nextInt();
        System.out.println("-정답 :" + answer2);
        if (answer2 == 1) {
            total+= 15;
        }
        System.out.println("3. Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        System.out.println("1) if-else, 2) for-in, 3) while, 4) def");
        int answer3 =sc.nextInt();
        System.out.println("-정답 :" + answer3);
        if (answer3 == 1) {
            total+=10;
        }
        System.out.println("4. Python에서 함수를 정의하는 방법은? (점수: 5점)");
        System.out.println("1) class, 2) def, 3) import, 4) return");
        int answer4 =sc.nextInt();
        System.out.println("-정답 :" + answer4);
        if (answer4 == 2) {
            total+=5;
        }
        System.out.println("—----- 결과 —-------------");
        System.out.println("응답한 내용 : "+ "1번 "+ answer1 +"," + "2번 "+answer2 +","+"3번 "+answer3 +","+ "4번 "+answer4);
        System.out.println("당신 응답 합계 :" + total +"점");
        String grade;
        if (total >= 30) {
            grade = "A";
        } else if (total>=20) {
            grade = "B";
        } else if (total >= 10) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("학점은 " + grade + "입니다.");
    }
}