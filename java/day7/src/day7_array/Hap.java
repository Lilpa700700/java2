package day7_array;

public class Hap {

	public static void main(String[] args) {
		
		int sum =0;
		for(int i=1; i<=10;i++) {
			sum = sum+1;
		}
System.out.println("sum(1~10) ="+sum);
//우ㅟ의 for문을 while문으로 바꾸시오.
sum =0;
int i =1;
while(i<=10) {//횟수를 알거나 모를때
	sum =sum+i;
	i++;
}
System.out.println("sum(1~10) ="+sum);
}

}
