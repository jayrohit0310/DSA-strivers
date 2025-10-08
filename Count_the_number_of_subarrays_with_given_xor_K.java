public class Count_the_number_of_subarrays_with_given_xor_K {
    public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; 
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int xorr = 0;
                for (int K = i; K <= j; K++) {
                    xorr = xorr ^ a[K];
                }

                if (xorr == k) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorK(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}
