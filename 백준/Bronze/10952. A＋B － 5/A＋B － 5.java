import java.util.Scanner;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int result = sum(a, b);
            if (result > 0) {
                System.out.println(result);
            }else{
                break;
            }
        }

    }
}