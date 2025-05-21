import java.util.Arrays;
import java.util.Scanner;

class Counter {
    private int[] data; // 입력 받는 데이터

    public Counter(int[] data) {
        // 생성자
        this.data = data;
    }

    public int count(int input) {
        // input과 같은 수의 개수를 세는 메소드
        int count = 0;
        for (int num : data) {
            if (num == input) {
                count++;
            }
        }
        return count;
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int input = sc.nextInt();
        sc.close();

//        int count1 = 0;
//        for (int num : arr) {
//            if (num == v) {
//                count1++;
//            }
//        }
        Counter counter = new Counter(arr);
        int result = counter.count(input);
        System.out.println(result);
    }
}
