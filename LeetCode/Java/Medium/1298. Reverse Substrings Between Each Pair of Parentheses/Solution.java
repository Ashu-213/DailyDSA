class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] arr = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(')
                stk.push(i);
            else if (s.charAt(i) == ')') {
                arr[i] = stk.pop();
                arr[arr[i]] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0, dir = 1; i < n; i += dir) {
            if (s.charAt(i) >= 'a')
                sb.append(s.charAt(i));
            else {
                i = arr[i];
                dir = -dir;
            }
        }
        return sb.toString();
    }
}