package challenge32;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int xA = 0;
        int yA = 0;
        int xB = getX();
        int yB = getY();
        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public double distance(int x, int y) {
        int xB = getX();
        int yB = getY();
        return Math.sqrt((xB - x) * (xB - x) + (yB - y) * (yB - y));
    }

    public double distance(Point point) {
        int xB = getX();
        int yB = getY();
        int x = point.getX();
        int y = point.getY();
        return Math.sqrt((xB - x) * (xB - x) + (yB - y) * (yB - y));
    }
}
