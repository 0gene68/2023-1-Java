import java.util.Scanner;

public class StringTest2 {
    //사용자에게 문자열을 받아 문자열이 "www"로 시작하는지를 검사하는 프로그램
    //사용자가 quit을 입력하면 프로그램 종료

    public static void main(String[] args){
        String s;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("문자열을 입력하세요> ");
            s = input.nextLine();

            if(s.equals("quit") == true){
                break;
            }
            if(s.matches("^www\\.(.+)")){
                System.out.println(s + " 은 'www'로 시작합니다.");
            } else {
                System.out.println(s + " 은 'www'로 시작하지 않습니다.");
            } 
        }
        
    }
}
