public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n) {
        double x = n;//assumed sqrt 
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));
            if (Math.abs(root - x) < 0.01/*accurate*/) {
                break;
            }

            x = root;
        }
        return root;
    }
}
