package day5;

public class Mehhod4_cube {

	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
		int num =cube();
		System.out.print(num+" ");
		}
	}
       public static int cube() {
    	   double result =Math.random()*6;
    	   return (int)(result+1);
       }
}
