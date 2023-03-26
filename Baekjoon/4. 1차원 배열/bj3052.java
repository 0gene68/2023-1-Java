package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class bj3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int count = 1; 

        for(int i = 0; i < array.length; i++){
            int num = sc.nextInt();
            array[i] = num % 42;
        }

        Arrays.sort(array);

        for(int i = 0; i < 9; i++){
            if(array[i] != array[i+1])
                count++;
        }

        System.out.println(count);
    }
}
