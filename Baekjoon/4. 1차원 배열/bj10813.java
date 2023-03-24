package 배열;

import java.util.Scanner;

public class bj10813 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
        int[] array = new int[N];

		for(int a = 1; a <= N; a++){
            array[a-1] = a;
        }
		
        int num = 0;

        for(int a = 0; a < M; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            num = array[i-1];
            array[i-1] = array[j-1];
            array[j-1] = num;
        }
        
        for(int a = 0; a < array.length; a++){
            System.out.print(array[a] + " ");
        }
	}
}