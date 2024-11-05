package day7_array;

import java.util.Scanner;

public class Whileq {

	public static void main(String[] args) {
		//1. 키보드로 입력값을 받아옴
		Scanner scan =new Scanner(System.in);
		//data라는 변수에 키보드로 받아온 변수를 넣으시오
	    char data =scan.next();
		//3.'q'입력값일떄 이블럭을 빠져나오게 프로그래밍하시오.
      while(true)(
    		  System.out.print("data>>"
    		  String data =scan.next();
    		  if(data.equals("q")) {
    	   break;
       }else
    	   System.out.print(data);
;}

}
