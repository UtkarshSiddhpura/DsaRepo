public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 37;
        int p = 4;

        System.out.print(/*"%.3f",*/ sqrt(n, p));
    }

    // Time: O(log(n))
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;//we want 36 further calculations
            }
        }
        System.out.println(s+ " " +e);
        double incr = 0.1;
        //run p times
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {// <= is required so it runs for equal and then we can subtract it 
                // if(root * root == n){
                //     return root;
                // }
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
