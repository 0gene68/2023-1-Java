package 배열;

import java.util.Scanner;

public class bj10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, X;
        N = sc.nextInt();
        X = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++){
            if(A[i] < X){
                System.out.print(A[i] + " ");
            }
        }
    }
}
