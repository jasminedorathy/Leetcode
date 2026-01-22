class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder v = new StringBuilder();
        Arrays.sort(strs);
        String f = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i<Math.min(f.length(), last.length()); i++) {
            if(f.charAt(i)!= last.charAt(i)){
                return v.toString();
            }
            v.append(f.charAt(i));
        }
       return v.toString();
    }
}