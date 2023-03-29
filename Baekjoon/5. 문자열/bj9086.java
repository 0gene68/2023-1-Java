package 문자열;

import java.util.Scanner;

public class bj9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String[] array = new String[T+1];

        for(int i = 1; i <= T; i++){
            array[i] = sc.next();
        }

        for(int i = 1; i <= T; i++){
            System.out.print(array[i].charAt(0));
            System.out.println(array[i].charAt(array[i].length() - 1));
        }
    }
}
