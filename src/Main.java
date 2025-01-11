

public class Main {
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(9.0, 3.0, -5.0);
        Vector3D v2 = new Vector3D(-3.0, 0.0, 2.0);

        System.out.println("V1: " + v1);
        System.out.println("V2: " + v2);

        System.out.println("Magnitude of V1: " + v1.getMagnitude());
        System.out.println("Magnitude of V2: " + v2.getMagnitude());

        System.out.println("Normalized V1: " + v1.normalize());
        System.out.println("Normalized V2: " + v2.normalize());

        System.out.println("V1 + V2: " + v1.add(v2));
        System.out.println("V1 * 2: " +v1.multiply(2));
        System.out.println("Dot Product of V1 and V2: " + v1.dotProduct(v2));
        System.out.println("Angle between V1 and V2: " + v1.angleBetween(v2));
        System.out.println("Cross Product of V1 and V2: " + v1.crossProduct(v2));
    }
}