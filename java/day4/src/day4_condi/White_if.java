package day4_condi;

import java.util.Scanner;

public class White_if {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) { // 'white'를 'while'로 수정
            System.out.print("정수만 입력 su >> ");
            int su = scan.nextInt();

            if (su == 0) {
                break; // su가 0이면 반복문 종료
            }

            System.out.println("입력한 정수: " + su); // 입력한 정수 출력
        }

        scan.close(); // 스캐너 종료
    }
}
