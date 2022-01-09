public class SetBits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

//        while (n > 0) {
//            count++;
//            n -= (n & -n);
//        }

        while (n > 0) {
            count++;
            n = n & (n-1);
        }

        return count;
    }
    //set ith bit to one 
    static void setTo1(int num , int n){
        int ans = (int)(Math.log(num) / Math.log(2)) + 1;
        System.out.println(ans);
        int mask = 1<<(ans-n);
        System.out.println(mask|num);
    }
}
