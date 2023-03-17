package test;

public class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    public Television(int channel, int volume, boolean onOff){
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    void print(){
        System.out.println("채널은" + channel + "이고 볼륨은 " + volume + "입니다.");
    }

    public static void main(String[] args){
        Television tv1 = new Television(7, 9, true);
        Television tv2 = new Television(9, 12, false);
        tv1.print();
        tv2.print();    
    }
}


