import java.util.Scanner;

public class Main {
    static int[] arr;

    public static void initBasketCount(int basketCount) {
        arr = new int[basketCount];
        for (int i = 0; i < basketCount; i++) {
            arr[i] = i + 1;
        }
    }

    public static void changeBasketCount(int a, int b) {
        int temp = arr[a - 1];
        arr[a - 1] = arr[b - 1];
        arr[b - 1] = temp;
    }

    public static void printBasketCount() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int basketCount = sc.nextInt();
        int changeCount = sc.nextInt();

        initBasketCount(basketCount);

        for (int i = 0; i < changeCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            changeBasketCount(a, b);
        }

        printBasketCount();
        sc.close();
    }
}
