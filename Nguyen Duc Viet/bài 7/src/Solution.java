import java.util.Scanner;

public class Solution {
    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n %10;
            n = n/10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE/10 && digit > 7)){
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE/10 && digit < -8)){
                return 0;
            }
            reversed = reversed*10 + digit;


        }
        return reversed;

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println(Solution.reverse(n));

    }
}