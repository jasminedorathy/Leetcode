class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            a.append(s.charAt(i));
            if(a.length()>=part.length()){
                int diff=a.length()-part.length();
                String b=a.substring(diff,a.length());
                if(b.equals(part)){
                    a.delete(diff,a.length());
                }
            }   
        }
        return a.toString();
    }
}