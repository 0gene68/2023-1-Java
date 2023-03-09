public class StringMethod {
    public static void main(String[] args){
        String s = "Hello World!"; //객체 생성

        //charAt(int index) : 지정된 인덱스에 있는 문자 반환
        char c = s.charAt(4);
        System.out.println(c);//o

        //compareTo(String anotherString) : 사전적 순서로 문자열을 비교
        //앞에 있으면 -1, 같으면 0, 뒤에 있으면 1을 반환
        int n1 = s.compareTo("I'm happy");
        System.out.println(n1); //-1
        
        //concat(String str) : 주어진 문자열을 현재의 문자열 뒤에 붙임
        String s1 = s.concat(" I'm happy.");
        System.out.println(s1); // Hello World! I'm happy.

        //equals(Object anObject) : 주어진 객체와 현재 문자열을 비교
        boolean b1 = s.equals("Hello World!");
        System.out.println(b1); //true

        //equalsIgnoerCase(String anotherString) : 대소문자를 무시하고 비교
        boolean b2 = s.equalsIgnoreCase("hello World!");
        System.out.println(b2);

        //isEmpty() : length()가 0이면 true를 반환
        boolean b3 = s.isEmpty();
        System.out.println(b3); //false

        //length() : 현재 문자열의 길이를 반환
        int n2 = s.length();
        System.out.println(n2); //11
        
        //replace(char target, char replacement) : 문자열 내의 문자를 다른 문자로 교환
        String s2 = s.replace("H","h");
        System.out.println(s2); //hello World!

        //substring(int beginIndex, int endIndex) : 문자열을 부분적으로 추출
        String s3 = s.substring(2, 5);
        System.out.println(s3); //llo

        //toUppercase() : 모든 소문자를 대문자로 변환
        String s4 = s.toUpperCase();
        System.out.println(s4); //HELLO WORLD!

        //toLowercase() : 모든 소문자를 대문자로 변환
        String s5 = s.toLowerCase();
        System.out.println(s5); //hello world!

    }
}
