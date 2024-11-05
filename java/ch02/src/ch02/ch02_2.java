package ch02_2;
import java.util.Scanner;
public class Asset {

	public static void main(String[] args) {
		System.out.println("나의 총자산금?");
		Scanner scan =new Scanner(Sysem.in);
		System.out.print("일하는 시작나이를 입력하시오.>>");
		int age=scan.nextInt();
		System.out.print("연봉을 입력하시오>>");
		int pay =scan.nextInt();
		int year=65-age;
		int asset=year*(pay);
		asset =asset*5;
		System.out.println("당신의 총자산은 (66세기준):"+asset+"천금액");

	}

}
