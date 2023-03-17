package 반복문;

import java.util.Scanner;

public class bj25304 {
    public static void main(String[] args){
    // 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
    // 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
    // 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
    // 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
    
        Scanner sc = new Scanner(System.in);

        long X, N, a, b;
        X = sc.nextLong();
        N = sc.nextLong();
        long sum = 0;

        for(long i = 0; i < N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            long price = a * b;
            sum += price;
        }

        if(X == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    


    }

}
