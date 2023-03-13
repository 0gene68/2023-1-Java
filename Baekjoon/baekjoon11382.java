import java.util.Scanner;

public class baekjoon11382 {
    public static void main(String[] args){
        //a + b + c의 값을 구하는 프로그램
        Scanner input = new Scanner(System.in);
        
        long a, b, c;

        a = input.nextLong();
        b = input.nextLong();
        c = input.nextLong();

        System.out.println(a + b + c);
        
    }
}
