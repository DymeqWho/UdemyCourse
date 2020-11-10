package challenge36;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getVolume() {
        return getArea() * height;
    }

    public double getHeight() {
        return height;
    }
}

//    public Cuboid(Rectangle rectangle, double height){
//        super(rectangle.getWidth(), rectangle.getLength());
//        if (height > 0)
//            this.height = height;
//        else this.height = 0;
//
//    }