
public class Circle {
    private float radius;

    Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (3.14 * this.radius * this.radius);
    }
}
