public class p_a_triangle {
    private int a;
    private int b;
    private int c;

    public void set_sides(int l1, int l2, int l3) {
        a = l1;
        b = l2;
        c = l3;
    }

    public void get_t_perimeter() {
        System.out.print("the triangle perimeter = ");
        System.out.println(a + b + c);
    }

    public void get_t_area() {
        int s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.print("the triangle area = ");
        System.out.println(area);
    }
}
