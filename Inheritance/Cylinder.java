public class Cylinder extends Circle {
    private float height;

    Cylinder() {

    }

    Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((2 * super.getArea()) + (2 * 3.14 * this.radius * this.height));
    }

}
