package 문자열;

import java.util.Scanner;

public class bj11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = s.charAt(i) - '0';
            sum += array[i];
        }

        System.out.println(sum);
    }
}
