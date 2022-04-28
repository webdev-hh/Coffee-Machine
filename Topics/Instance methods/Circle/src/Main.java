
class Circle {

    double radius;

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}