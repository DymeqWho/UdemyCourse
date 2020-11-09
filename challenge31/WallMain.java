package challenge31;

public class WallMain {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("wall.getWidth() = " + wall.getWidth());
        System.out.println("wall.getHeight() = " + wall.getHeight());
        System.out.println("wall.getArea() = " + wall.getArea());
    }
}
