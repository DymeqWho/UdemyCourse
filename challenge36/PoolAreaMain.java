package challenge36;

public class PoolAreaMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 101);
        System.out.println("rectangle.getWidth() = " + rectangle.getWidth());
        System.out.println("rectangle.getLength() = " + rectangle.getLength());
        System.out.println("rectangle.getArea() = " + rectangle.getArea());
//        Cuboid cuboid = new Cuboid(rectangle,5);
//        System.out.println("cuboid.getWidth() = " + cuboid.getWidth());
//        System.out.println("cuboid.getLength() = " + cuboid.getLength());
//        System.out.println("cuboid.getArea() = " + cuboid.getArea());
//        System.out.println("cuboid.getHeight() = " + cuboid.getHeight());
//        System.out.println("cuboid.getVolume() = " + cuboid.getVolume());
        Cuboid cuboid1 = new Cuboid(5, 10, 4);
        System.out.println("cuboid1.getWidth() = " + cuboid1.getWidth());
        System.out.println("cuboid1.getLength() = " + cuboid1.getLength());
        System.out.println("cuboid1.getArea() = " + cuboid1.getArea());
        System.out.println("cuboid1.getHeight() = " + cuboid1.getHeight());
        System.out.println("cuboid1.getVolume() = " + cuboid1.getVolume());
    }
}
