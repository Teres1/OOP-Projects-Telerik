enum Directions {
    UP, DOWN, RIGHT, LEFT
}


public class Point {
    public static int getPointsCount() {
        return pointsCount;
    }

    public static int pointsCount = 0;
    private double x;
    private double y;

    public char getTitle() {
        return title;
    }

    private char title;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Point(char title, double x, double y) {
        pointsCount++;
        this.x = x;
        this.y = y;
        this.title = title;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    public void move(Directions direction, double distance) {
        switch (direction) {
            case UP:
                y += distance;
                break;
            case DOWN:
                y -= distance;
                break;
            case LEFT:
                x -= distance;
                break;
            case RIGHT:
                x += distance;
                break;
        }
    }
}
