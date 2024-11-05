package day5;

public class Method3 {

    public static void main(String[] args) {
    	int num=0;
        for (int i = 1; i <= 6; i++) {
            int num = lotto();
            System.out.println(num+",");
        }
    }

    public static int lotto() {
        int lottosu = (int)(Math.random() * 45) + 1;
        return lottosu;
    }
}
