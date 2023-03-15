package test;

public class safeArray {
    private int[] a; //배열 a 생성

    //길이가 size인 배열을 생성하는 메소드
    public void createArray(int size){
        a = new int[size]; 
    }

    //배열 a의 지정된 인덱스 값을 반환하는 메소드
    //잘못된 인덱스 값일 경우 -1을 반환
    public int get(int index){
        if(index >= 0 && index < a.length)
            return a[index];
        System.out.println("잘못된 인덱스 : " + index);
        return -1;
    }

    //배열 a의 인덱스에 원하는 값을 저장하는 메소드
    //잘못된 인덱스 값일 경우 값이 저장되지 않음
    public void put(int index, int value){
        if(index >= 0 && index < a.length){
            a[index] = value;
            return;
        }
        System.out.println("잘못된 인덱스 : " + index);
        
    }
    
    public static void main(String[] args){
        safeArray array = new safeArray(); //객체 생성

        array.createArray(10); //길이가 10인 배열 생성

        array.put(2, 100); //2번 인덱스에 100 입력
        array.put(10, 200); //10번 인덱스에 200 입력 -> 10번 인덱스가 존재하지 않으므로 "잘못된 인덱스 : 10"이 출력됨

        System.out.println(array.get(2)); //2번 인덱스의 값을 출력
        System.out.println(array.get(10)); //10번 인덱스의 값을 출력 -> 10번 인덱스가 존재하지 않으므로 "잘못된 인덱스 : 10 -1"이 출력됨
    }
}
