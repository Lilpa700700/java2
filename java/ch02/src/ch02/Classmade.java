package ch02;

public class Classmade {

	public static void main(String[] args) {
		Friend f1 =new Friend();//1. 클래스 Friend 객체를 생선문으로 쓰시오
		System.out.println("1:"+f1.toString());//2. 1번에서 만든 객체정보를 출력하시오
		f1.no =1; //값을 대입 //3. 객체에 각 변수에 맞는 값을 할당하시오
		f1.name="kim";
		f1.when ="유치원친구";
		f1.story ="동화유치원6살동기";
		System.out.println("2:"+f1.toString());
	}

}
class Friend{
	int no;//no
	String name;//name
    String when;//when
	String story;
	@Override
	public String toString() {
		return "Friend [no=" + no + ", name=" + name + ", when=" + when + ", story=" + story + "]";
	}//story
	
}
