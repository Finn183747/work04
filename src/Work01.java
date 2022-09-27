import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 2;
        while (a <= n) {
            if (n == 2 || n == 4) {
                System.out.println(2);
                break;
            }a++;
            if (n % a == 0) {
                System.out.println(a);
                break;
            }
        }
    }
}