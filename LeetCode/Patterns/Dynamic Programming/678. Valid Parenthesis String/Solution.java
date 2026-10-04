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