class Solution {
    public int count(String str){
        int co = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1')co++;
        }
        return co;
    }
    public int numberOfBeams(String[] bank) {
        int total = 0;
        int st = count(bank[0]);

        for(int i=1;i<bank.length;i++){
            int val = count(bank[i]);
            total += val * st;
            if(val!=0)
            st = val;
        }
        return total;
    }
}