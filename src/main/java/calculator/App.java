package calculator;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;

        int result = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int first = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int second = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

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
            queue.offer(result);
            index++;
            if (index == 10) {
                queue.poll();
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.next().equals("remove")) {
                queue.poll();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                queue.forEach(num -> System.out.print(num + " "));
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equals("exit")) {
                break;
            }
        }
    }
}
