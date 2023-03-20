package 배열;

import java.util.Scanner;

public class bj10818{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N;
        long max, min;
        N = sc.nextInt();

        long[] array = new long[N];

        for(int i = 0; i < N; i++){
            array[i] = sc.nextLong();
        }

        max = array[0];
        min = array[0];

        for(int i = 0; i < N; i++){
            if(max > array[i])
                max = array[i];

            if(min < array[i]){
                min = array[i];
            }
        }
        
        System.out.println(max + " " + min);
        
    }
}