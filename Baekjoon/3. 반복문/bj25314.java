package 반복문;

import java.util.Scanner;

public class bj25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long N;
        N = sc.nextLong();

        String s = "long int";

        if(N % 4 == 0){
            if(N / 4 != 1){
                for(int i = 0; i < N/4 - 1; i++){
                    s = "long " + s;
                }
                System.out.println(s);
            } else {
                System.out.println(s);
            }
        }
    }
}
