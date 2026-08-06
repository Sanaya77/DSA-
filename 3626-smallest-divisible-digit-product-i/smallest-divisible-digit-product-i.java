class Solution {
    public int smallestNumber(int n, int t) {

        for (int m = n; ; m++) {

            int prod = 1;
            int k = m;

            while (k > 0) {
                int digit = k % 10;
                prod *= digit;
                k /= 10;
            }

            if (prod % t == 0) {
                return m;
            }
        }
    }
}