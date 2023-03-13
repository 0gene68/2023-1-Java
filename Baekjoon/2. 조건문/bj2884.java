package 조건문;

import java.util.Scanner;

public class bj2884 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int h, m;

        h = input.nextInt();
        m = input.nextInt();

        if(m < 45){
            if(h == 0){
                System.out.println((h+23) + " " + (m+15));
            } else {
                System.out.println((h-1) + " " + (m+15));
            }
        } else { 
                System.out.println(h + " " + (m-45));       
        }
    }
}
