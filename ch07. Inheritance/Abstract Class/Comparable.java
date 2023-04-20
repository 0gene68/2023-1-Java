package ch07;

public abstract class Comparable {
    // 알파벳 순으로 내 이름 앞이면 -1, 이름이 같으면 0, 내 이름 뒤면 1을 반환
    // Returns -1 if before my first name in alphabetical order, 0 if the names are the same, and 1 if after my first name.

    // 추상 메소드 : 추상 클래스 Comparable 클래스 내의 메소드로, Comparable 클래스를 상속받는 클래스에서 반드시 구현되어야 함
    // Abstract method: As a method in the abstract class Comparable class, it must be implemented in the class inheriting the Comparable class.
    public abstract int compareTo(Comparable anotherVal);    
}

