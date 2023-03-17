package test2;

public class Box {
    private int width, length, height;
    
    public Box(int w, int l, int h){
        this.width = w;
        this.length = l;
        this.height = h;
    }
    
    public int getVolume(){
        return width * length * height;
    }

    public static Box whatisLargerBox(Box box1, Box box2){
        if(box1.getVolume() > box2.getVolume()){
            return box1;
        }
        return box2;
    }

    public static void main(String[] args){
        Box b1 = new Box(10, 20, 50);
        Box b2 = new Box(10, 30, 30);
        System.out.println("첫 번째 박스의 부피: " + b1.getVolume());
        System.out.println("두 번째 박스의 부피: " + b2.getVolume());

        Box largerBox = Box.whatisLargerBox(b1, b2);
        System.out.println("더 큰 박스의 부피: " + largerBox.getVolume());
    }   
}
