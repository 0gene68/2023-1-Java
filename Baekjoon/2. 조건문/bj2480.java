package 조건문;

import java.util.Scanner;

public class bj2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, c, reward;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int[] array = {a, b, c};
        int max = array[0];

        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }    
        }

        if(a == b && b == c && c == a){
            reward = 10000 + a * 1000;
            System.out.println(reward);
        } else if (a == b || b == c || c == a){
            if(a == b){
                System.out.println(1000 + a * 100);
            } else if(b == c){
                System.out.println(1000 + b * 100);
            } else if(c == a){
                System.out.println(1000 + a * 100);
            }
        } else {
            System.out.println(max * 100);
        }
    }    
}
