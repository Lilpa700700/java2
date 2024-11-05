package day5; // 공동프로젝트하면서 클래스이름등 공동변수등의 이름충돌을 막기 위해

public class Method1 {

    public static void main(String[] args) { // 자식1
        int result = square(4);
        System.out.println("square(4) = " + result);
        System.out.println("Math.abs(-100) = " + Math.abs(-100));
        
        result = Math.max(2, 7);
        System.out.println("Math.max(2, 7) = " + result);
        
        result = Math.min(2, 7);
        System.out.println("Math.min(2, 7) = " + result); // 매개변수
        
        System.out.println("------------");
        result = area(5, 120);
        System.out.println("area(5, 120) = " + result);
        
        result =add(4,5);
        result =sub(50,3);
    } // main
    private static int sub(int i, int j) {
    	return 0;
    }
    private static int add(int i, int j) {
    	
    	return squre;
    }

    public static int area(int w, int h) { // 변경: static 추가
        return w * h;
    }

    public static int square(int n) { // 자식2 n은 파라미터
        return n * n;
    } // square
} // class

