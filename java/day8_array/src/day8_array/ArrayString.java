package day8_array;

public class ArrayString {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
    
        String[] games = {"starcraft", "리니지", "메이플"};
        for (int i = 0; i < games.length; i++) {  // Corrected 'lenght' to 'length'
            System.out.println(games[i] + " ");
        }
        System.out.println(" ");
        System.out.print("등 수: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
