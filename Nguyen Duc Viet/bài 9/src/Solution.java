import java.util.Scanner;

public class Solution {
    public static int sumOfDigits(int n) {

        int sum = 0;

        if (n < 0) {
            n = -n;
        }

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int n = sc.nextInt();
        System.out.println(Solution.sumOfDigits(n));

    }
}