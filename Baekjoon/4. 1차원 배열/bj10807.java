package 배열;

import java.util.Scanner;

public class bj10807 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N, num, v;
        int sum = 0;
        N = sc.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }

        v = sc.nextInt();
        for(int i = 0; i < array.length; i++){
            if(array[i] == v){
                sum++;
            }
        }
        
        System.out.println(sum);
    }
}
