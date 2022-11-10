public class Main {
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        // Задание 1
        int sumMonth = 0;
        for (int value : arr) {
            sumMonth += value;
        }
        System.out.println(sumMonth);
        // Задание 2
        int minDaySpending = arr[0];
        int maxDaySpending = 0;
        for (int k : arr) {
            if (maxDaySpending < k) {
                maxDaySpending = k;
            }
        }
        for (int j : arr) {
            if (minDaySpending > j) {
                minDaySpending = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxDaySpending + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minDaySpending + " рублей");
        // Задание 3
        System.out.println(sumMonth / 30);
        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}