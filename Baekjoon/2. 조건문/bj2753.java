package 조건문;

import java.util.Scanner;

public class bj2753 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int isLeapYear;
        isLeapYear = input.nextInt();

        if((isLeapYear % 4 == 0) && (isLeapYear % 100 != 0) || (isLeapYear % 400 == 0)){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
