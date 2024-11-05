package ch02;

public class Test_type1 {

	public static void main(String[] args) {
		Student s1 =new Student();
		System.out.println("초기값은"+s1.toString());
		s1.name ="남기욱";
		s1.no =18;
		s1.dept="AI";
		System.out.printIn("할당후:"+s1.toString());
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Test_type1 []";
	}

}
class Student{
	int no;
	String name;
	String dept;
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
		
	
}
