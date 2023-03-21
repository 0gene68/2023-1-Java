package 배열;

import java.io.IOException;
import java.util.Scanner;
public class bj10810 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] array = new int[N+1];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(int a = 0; a < M; a++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for(int b = i; b <= j; b++) {
				array[b] = k;
			}
		}
		for(i = 1; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
}
