package 배열;

import java.util.Scanner;

public class bj1546{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] array = new double[N];
        double score, avg;
        double sum = 0; 

        for(int i = 0; i < N; i++){
            score = sc.nextInt();
            array[i] = score;
        }
        
        double max = array[0];

        for(int i = 0; i < N; i++){
            if(array[i] > max)
                max = array[i];
        }

        for(int i = 0; i < N; i++){
            array[i] = (array[i] / max) * 100;
            sum += array[i];
        }
        
        avg = sum / array.length;

        System.out.println(avg);
    }
}