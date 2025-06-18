public class Collinearity{

    public static boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        int part1 = x1 * (y2 - y3);
        int part2 = x2 * (y3 - y1);
        int part3 = x3 * (y1 - y2);
        int area = part1 + part2 + part3;

        System.out.println("Formula: 0.5 * [x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)]");
        System.out.println("Values:  0.5 * [" + x1 + "*(" + y2 + " - " + y3 + ") + "
                + x2 + "*(" + y3 + " - " + y1 + ") + " + x3 + "*(" + y1 + " - " + y2 + ")]");
        System.out.println("Area Calculation: 0.5 * (" + part1 + " + " + part2 + " + " + part3 + ") = 0.5 * " + area);

        return area == 0;
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        boolean result = isCollinear(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear: " + result);
    }
}
