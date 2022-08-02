public class Triangle {

    enum Type {
        INVALID,
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
    };

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Type check() {
        if (a > b + c || b > a + c) {
            return Type.INVALID;
        } else if (a == b && b == c) {
            return Type.EQUILATERAL;
        } else if (a == b || b == c) {
            return Type.ISOSCELES;
        } else {
            return Type.SCALENE;
        }
    }
}
