package test;

import java.util.Scanner;

public class ArrayProc {
    private int[] array;

    public void getValues(int[] array){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("성적을 입력하시오:");
            array[i] = sc.nextInt();
        }
    }
    public double getAverage(int[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += array[i];
        return sum / array.length;
    }
    
    public static void main(String[] args){
        final int STUDENTS = 5;

        int[] scores = new int[STUDENTS];
        ArrayProc ap = new ArrayProc();
        ap.getValues(scores);
        
        System.out.println("평균은 = " + ap.getAverage(scores));
    }

}
