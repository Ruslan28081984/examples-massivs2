import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
//        generateRandomArray();
        example2();
    }
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random(100000);
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) ;
        }
        int sumMes = 0;
        for (int element: arr) {
            sumMes += element;
            System.out.println(sumMes);
        }
        System.out.println(sumMes);
       return arr;
    }

    public static void example2(){

        int [] sum = new int [30];
        int sumMonth = 0;
        Random random = new Random();
        for (int i = 0; i < sum.length; i++) {
            sum[i] = random.nextInt(100_000 ) +100_000;
            sumMonth += sum[i];
            System.out.println(sum[i]);
        }
        System.out.print("сумма чисел  массива из " + sum.length + "-ти элементов равна: ");
        System.out.println(sumMonth);

    }

}






