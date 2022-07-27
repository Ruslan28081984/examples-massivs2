import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int sumMonth = 0;
        int minNum = 0;
        int maxNum = 0;
       // int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            sumMonth += arr[i];
            //System.out.println(arr[i]);
        }
        System.out.print("сумма чисел  массива из " + arr.length + "-ти элементов равна: ");
        System.out.println(sumMonth);
    }
}









