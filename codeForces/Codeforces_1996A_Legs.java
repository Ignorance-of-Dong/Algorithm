// AC: 233 ms 
// Memory: 1200 KB
// .
// T:O(t), S:O(1)
// 
import java.util.Scanner;

public class Codeforces_1996A_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n % 4 == 0 ? (n / 4) : (n / 4 + 1));
        }
    }
}
