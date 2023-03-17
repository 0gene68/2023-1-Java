public class Box2 {
    private int width, length, height;

    Box2(int w, int l, int h){
        width = w;
        length = l;
        height = h;
    }

    boolean isSameBox(Box2 obj){
        if(obj.width == width && obj.length == length && obj.height == height)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        Box2 b1 = new Box2(10, 20, 30);
        Box2 b2 = new Box2(10, 20, 30);

        System.out.println("b1 == b2 : " + b1.isSameBox(b2));

    }

}
