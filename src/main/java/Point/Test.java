package Point;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 2);
        Point3D point3D = new Point3D(3, 3, 3);

        System.out.println(point2D.toString());
        System.out.println(point3D.toString());

        point2D.setXY(4,4);
        point3D.setXYZ(5,5,5);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}
