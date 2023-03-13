import java.util.Scanner;

public class baekjoon18108 {
    public static void main(String[] args){
        //불기 연도를 입력받으면 서기 연도로 변환하는 프로그램
        Scanner input = new Scanner(System.in);
        
        int y;
        y = input.nextInt(); //불기 연도를 입력받음

        System.out.println(y - 543); //서기 연도 = 불기 연도 - 543

    }
}
