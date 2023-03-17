package test;

public class Box {
    private int width;
    private int length;
    private int height;
    private int volume;

    public int getVolume(){
        return volume;
    }

    public Box(int w, int l, int h){
        this.width = w;
        this.length = l;
        this.height = h;
        volume = w * l * h;
    }

    public static void main(String[] args){
        Box b = new Box(20, 30, 30);
        System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
    }
}

