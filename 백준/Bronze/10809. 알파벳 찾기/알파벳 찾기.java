import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int[] alphabetIndex = new int[26];
        Arrays.fill(alphabetIndex, -1);

        for (int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            int index = w - 'a';
            if (alphabetIndex[index] == -1) {
                alphabetIndex[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(alphabetIndex[i] + " ");
        }
        sc.close();
    }
}
