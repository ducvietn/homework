import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(int n) {
        int reversed = 0;
        int org = n;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            reversed = reversed * 10 + digit;
        }
        if (org == reversed) {
            return true;
        } else {
            return false;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println(Solution.isPalindrome(n));
    }
}

