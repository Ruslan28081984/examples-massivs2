import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        generateRandomArray();
        int[] arr = generateRandomArray();
        int sumMonth = 0;

        System.out.print("сумма чисел  массива из " + arr.length + "-ти элементов равна: ");
        System.out.println(sumMonth);



    }
        public static int[] generateRandomArray() {

            Random random = new Random();
            int sumMonth = 0;
            int minNum = 0;
            int maxNum = 0;
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
                sumMonth += arr[i];
                //System.out.println(arr[i]);
            }
            return arr;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < maxNum) {
                    maxNum = arr[i];
                    System.out.println(" максимальное значение: " + arr[i]);
                }

            }


        }

    }









