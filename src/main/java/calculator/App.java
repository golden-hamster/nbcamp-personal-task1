package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int first = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int second = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first = second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                if (second == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                }
                result = first / second;
                break;
        }
        System.out.println("결과: " + result);
    }
}
