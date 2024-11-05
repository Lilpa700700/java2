package ch02;

import java.util.Scanner;

public class job {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("원하는 연봉은?>> ");
        int money = scan.nextInt();
        
        System.out.print("원하는 거리는?>> ");
        int distance = scan.nextInt();

        if (money >= 300 && distance <= 15) {
            System.out.println("입사");
        } else {
            System.out.println("입사보류");
        }
    }
}

