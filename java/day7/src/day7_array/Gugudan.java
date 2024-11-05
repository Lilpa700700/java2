package day7_array;

public class Gugudan {

	public static void main(String[] args) {
		int dan, i;
		System.out.println("구구단별 묶음으로 출력하기");
		for(dan =2; dan<10; dan++) {
			//System.out.print("["+dan +"단]:");
			for(dan =2; dan<10; dan++) {
				System.out.printf("%2d*%1d=%2d ",dan,i,dan*i);
			}//i
			System.out.println("");
		}//dan
		

	}//main

}//class
