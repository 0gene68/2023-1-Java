
public class Television {
	int channel; //채널
	int volume; //볼륨
	boolean isOn; //전원 on/off 상태(true -> on / false -> off)

	//객체에 대한 정보 출력
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}

	//현재 채널은 반환하는 메소드 추가
	int getChannel(){
		return channel;
	}

	//텔레비전의 채널을 메소드를 통해 설정
	void setChannel(int ch){
		channel = ch;
	}

	public static void main(String[] args) {
		
		//텔레비전 객체 myTV 생성
		Television myTV = new Television();
		
		myTV.channel = 9; //myTV의 채널을 9로 설정 
		myTV.volume = 7; //myTV의 볼륨을 7로 설정
		myTV.isOn = true; //myTV의 on/off 상태를 on으로 설정
		myTV.getChannel(); //myTV의 채널 반환
		myTV.print(); //텔레비전 객체 상태 출력
		
		//텔레비전 객체 yourTV 생성
		Television yourTV = new Television();
		
		yourTV.setChannel(9); //yourTV의 채널을 9로 설정
		yourTV.volume = 12; //yourTV의 볼륨을 12로 설정
		yourTV.isOn = false; //yourTV의 on/off 상태를 off로 설정
		yourTV.getChannel(); //yourTV의 채널 반환
		yourTV.print(); //텔레비전 객체 상태 출력
	}
}

	

	

