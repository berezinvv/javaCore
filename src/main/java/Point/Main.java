package Point;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Point3D point3D_1 = new Point3D(2, -7, 0);
        System.out.println("Point : " + point3D_1);

        Point3D point3D_2 = new Point3D(4, 4, -2);

        //System.out.println("Distance to point: " + point3D_1.distanceTo(point3D_2));

        //point3D_1.moveTo(point3D_2);
        //System.out.println("Move to point: " + point3D_1);
        PointSet pointSet = new PointSet();
        pointSet.addPoint(point3D_1);
        pointSet.addPoint(point3D_2);

        System.out.println(pointSet);
    }
}

class Point3D {
    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distanceTo(Point3D point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2)
                + Math.pow(this.y - point.getY(), 2)
                + Math.pow(this.z - point.getZ(), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void moveTo(Point3D point) {
        this.x = point.getX();
        this.y = point.getY();
        this.z = point.getZ();
    }

    @Override
    public String toString() {
        return "(" +
                x +
                "," + y +
                "," + z +
                ')';
    }
}

class PointSet {
    Set<Point3D> point3DSet;

    public PointSet() {
        point3DSet = new HashSet<Point3D>();
    }

    public void addPoint(Point3D point) {
        point3DSet.add(point);
    }

    @Override
    public String toString() {
        return "PointSet{" +
                point3DSet +
                '}';
    }

    public double distance() {
        double distance = 0;

        if (point3DSet.isEmpty() || point3DSet.size() == 1) {
            return 0;
        }

        Point3D tmpPoint;
        for (Point3D point : point3DSet) {


                tmpPoint = point;
        }
        return distance;
    }

    public void move() {

    }
}