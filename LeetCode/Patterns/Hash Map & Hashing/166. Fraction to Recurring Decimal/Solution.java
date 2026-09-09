class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (denominator == 0) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        
        if((numerator > 0 && denominator < 0) || (numerator < 0 && denominator > 0)) {
            res.append("-");
        }
        
        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        res.append(n / d);
        long remainder = n % d;

        if (remainder == 0) {
            return res.toString();
        }
        res.append(".");

        HashMap<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int idx = map.get(remainder);
                res.insert(idx, "(");
                res.append(")");
                break;
            }
            map.put(remainder, res.length());

            remainder *= 10;
            res.append(remainder / d);
            remainder %= d;
        }
        return res.toString();
    }
}