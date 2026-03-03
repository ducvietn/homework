import java.util.Scanner;

public class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so b: ");
        int b = sc.nextInt();
        System.out.println(Solution.gcd(a,b));
    }
}