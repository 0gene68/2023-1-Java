package 조건문;

import java.util.Scanner;

public class bj1330{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        long a, b;

        a = input.nextLong();
        b = input.nextLong();

        if(a > b){
            System.out.println(">");
        } else if(a < b){
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        
    }   
}
