public class Box {
	int width; //상자의 가로 길이
	int length; //상자의 세로 길이
	int height; //상자의 높이

	//객체의 정보를 출력할 print() 메소드 생성
	void print(){
		System.out.println("상자의 가로, 세로, 높이는 " + width + ", " + length + ", " + height + "입니다. ");
	}

	public static void main(String[] args) {
		//박스 객체 생성
		Box b = new Box();
		
		b.width = 20; //상자의 가로 길이를 20으로 설정
		b.length = 20; //상자의 세로 길이를 20으로 설정
		b.height = 30; //상자의 높이를 30으로 설정
		
		b.print(); //박스 객체 정보 출력
		
	}
}
