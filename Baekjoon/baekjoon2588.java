import java.util.Scanner;

public class baekjoon2588 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        String b;

        a = input.nextInt();
        b = input.next();

        char c1 = b.charAt(2);
        char c2 = b.charAt(1);
        char c3 = b.charAt(0);

        int n = Integer.parseInt(b);

        System.out.println(a * (c1 - '0'));
        System.out.println(a * (c2 - '0'));
        System.out.println(a * (c3 - '0'));
        System.out.println(a * n);
    }
}
