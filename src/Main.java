import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      //  task123();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task123() {
        int[] arr = generateRandomArray();
        Arrays.sort(arr);
        int minNum = arr[0];
        int maxNum = arr[arr.length - 1];
        int sumMonth = 0;
        double averageValue = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sumMonth += arr[i];
            System.out.println(arr[i]);
        }
        System.out.print("сумма чисел  массива из " + arr.length + "-ти элементов равна: ");
        System.out.println(sumMonth);
        averageValue = sumMonth / averageValue;
        System.out.println(" максимальная трата в день: " + maxNum);
        System.out.println(" минимальная трата в день: " + minNum);
        System.out.println("Средняя сумма трат за месяц составила: " + averageValue + " рублей");
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}














