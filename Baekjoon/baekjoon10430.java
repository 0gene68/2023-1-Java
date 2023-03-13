import java.util.Scanner;

public class baekjoon10430 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}
