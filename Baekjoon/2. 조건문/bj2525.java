package 조건문;

import java.util.Scanner;

public class bj2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(B + C < 60){
            System.out.println(A + " " + (B + C));
        } else {
            A += (B + C) / 60;
            if(A >= 24){
                A -= 24;
            }
            B = (B + C) % 60;
            System.out.println(A + " " + B);
        }
        
    }
}
