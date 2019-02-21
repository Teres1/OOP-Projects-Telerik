import java.io.IOException;

public class DrivenClass {
    public static void main(String[] args) throws IOException {

        Point p = new Point('A', 1.0, 2.0);
        System.out.printf("%c(%.2f,%.2f)\n", p.getTitle(), p.getX(), p.getY());
        System.out.printf("Points count is %d\n", Point.pointsCount);
        Point b = new Point('B', 1.0, 2.0);
        Point c = new Point('C', 2.0, 3.0);
        System.out.printf("Points count now is %d\n", Point.getPointsCount());
        p.move(Directions.DOWN, 3.0);
        p.move(Directions.RIGHT, 2.5);
        System.out.printf("New coordinates of p are:%.2f,%.2f", p.getX(), p.getY());
    }
}
