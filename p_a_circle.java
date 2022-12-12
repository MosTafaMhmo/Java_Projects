public class p_a_circle {
    private int r;

    public void set_r(int l) {
        r = l;
    }

    public void get_c_perimeter() {
        System.out.print("the triangle perimeter = ");
        System.out.println(2 * 3.14 * r);
    }

    public void get_c_area() {
        System.out.print("the circle area = ");
        System.out.println(3.14 * r * r);
    }
}
