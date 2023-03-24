package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class bj5597 {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);

        boolean[] array = new boolean[31];

        for(int i = 0; i < 28; i++){
            int n = sc.nextInt();
            array[n-1] = true; 
        }
        
        for(int i = 0; i < 30; i++){
            if(array[i] == false)
                System.out.print(i+1 + " ");
        }
    }
}

