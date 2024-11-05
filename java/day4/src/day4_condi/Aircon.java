package day4_condi;
public class Aircon {

	public static void main(String[] args) {
		int temp =23;
		turnOn(temp);
        buybeer(18);
	}//main
	public static void turnOn(int temp) {
		if(temp>25) {
			System.out.println("현재온도:"+temp+" 에어컨 동작");
		}//if
		else
			System.out.println("가을온도여서 에어컨 작동안함");
	}//turnOn
	public static void buybeer(int age) {
	    if(age>=19) 
	        System.out.println("맥주 구매 가능");
	     else 
	        System.out.println("맥주 구매 불가능");    
	}
}//class
