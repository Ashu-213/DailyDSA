class Solution {
    public boolean sumGame(String num) {
        // not equal -> true -> Alice wins
        // equal -> false -> Bob wins
        int n = num.length();
        int q1 = 0, q2 = 0;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                q1++;
            } else {
                sum1 += num.charAt(i) - '0';
            }
        }
        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                q2++;
            } else {
                sum2 += num.charAt(i) - '0';
            }
        }
        int diff = sum1 - sum2;
        int qdiff = q2 - q1;
        return diff * 2 != qdiff * 9;
    }
}