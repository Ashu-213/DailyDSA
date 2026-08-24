class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact*i;
            list.add(i);
        }
        fact = fact/n;
        k = k-1;
        StringBuilder s = new StringBuilder();
        while(true){
            s.append(list.get(k / fact));
            list.remove(k / fact);

            if(list.size() == 0)break;
            k%=fact;
            fact = fact / list.size();
        }
        return String.valueOf(s);
    }
}