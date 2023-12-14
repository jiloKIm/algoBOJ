import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        Collections.sort(points);

        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }

    static class Point implements Comparable<Point> {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point other) {
            if (this.x == other.x) {
                return Integer.compare(this.y, other.y);
            }
            return Integer.compare(this.x, other.x);
        }
    }
}
