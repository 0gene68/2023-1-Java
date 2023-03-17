package 반복문;

import java.util.Scanner;

public class bj10950 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
