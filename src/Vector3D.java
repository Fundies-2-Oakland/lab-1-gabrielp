
public class Vector3D {
    //our variables representing x,y,z dimensions in space
    private double x;
    private double y;
    private double z;

    //constructor
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    //ToString method
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    //get the magnitude of the vector using the equation
    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    //normalize method
    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0.0){
            throw new IllegalStateException("Cannot Normalize");
        }
        return new Vector3D(x / magnitude, y / magnitude, z);
    }

    //add method
    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.x, y + other.y, z + other.z);
    }

    //multiply method
    public Vector3D multiply(double scalar) {
        return new Vector3D(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    //dot product
    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    //angle between
    public double angleBetween(Vector3D other) {
        double magnitude1 = this.getMagnitude();
        double magnitude2 = other.getMagnitude();

        if (magnitude1 ==0 || magnitude2 == 0) {
            throw new IllegalStateException("Cannot calculate angle with a zero vector");
        }

        double dotProduct = this.dotProduct(other);
        double cosAngle = dotProduct / (magnitude1 * magnitude2);
        return Math.toDegrees(Math.acos(cosAngle));
    }

    //Cross Product method
    public Vector3D crossProduct(Vector3D other) {
        double crossX = this.y * other.z - this.z * other.y;
        double crossY = this.z * other.x - this.x * other.z;
        double crossZ = this.x * other.y - this.y * other.x;
        return new Vector3D(crossX, crossY, crossZ);
    }

}
