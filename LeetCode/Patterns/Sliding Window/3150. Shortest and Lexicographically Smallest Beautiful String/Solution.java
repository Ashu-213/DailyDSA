class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();
        String ans = "";
        int l = 0, ones = 0;

        for (int r = 0; r < n; r++) {

            if (s.charAt(r) == '1') {
                ones++;
            }

            while (ones > k) {
                if (s.charAt(l) == '1') {
                    ones--;
                }
                l++;
            }

            if (ones == k) {
                while (s.charAt(l) == '0') {
                    l++;
                }
                String curr = s.substring(l, r + 1);
                if (ans.equals("") || curr.length() < ans.length() || (curr.length() == ans.length() && curr.compareTo(ans) < 0)) {

                    ans = curr;
                }
            }
        }
        return ans;
    }
}