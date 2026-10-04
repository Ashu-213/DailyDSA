class Solution {
    public boolean checkValidString(String s) {

        int low = 0;
        int high = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low--;
                high--;
            } else { // '*'
                low--;
                high++;
            }

            if (high < 0) {
                return false;
            }

            if (low < 0) {
                low = 0;
            }
        }

        return low == 0;
    }
}



/*
class Solution {
    public boolean solve(String s, int idx, int count) {
        int n = s.length();

        if(count < 0) return false;
        if(idx == n){
            return count == 0;
        }

        char c = s.charAt(idx);
        if(c == '('){
            return solve(s, idx+1, count+1);
        }else if(c == ')'){
            return solve(s, idx+1, count-1);
        }else{
            return 
            solve(s, idx+1, count) ||
            solve(s, idx+1, count+1) ||
            solve(s, idx+1, count-1);
        }
    }
    public boolean checkValidString(String s) {
        return solve(s, 0, 0);
    }
}
*/

