package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class bj1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // st라는 이름의 StringTokenizer 객체를 만들어 공백을 기준으로 나눈 토큰들을 저장함
        StringTokenizer st = new StringTokenizer(s, " ");

        // countTokens() : StringTokenizer 클래스의 메소드로, 토큰의 개수를 반환함
        System.out.println(st.countTokens());

    }
}
