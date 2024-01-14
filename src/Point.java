public class Point {
    private int x;
    private int y;

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

    public double distance () {
        return Math.sqrt(x * x + y * y);
    }
    public double distance(Point p) {
        int deltaX = p.getX() - this.x;
        int deltaY = p.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public double distance(int a, int b) {
        int deltaX = a - this.x;
        int deltaY = b - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}
