class Solution {
    public static String cleanString(String input){
      
        input = input.replace(" ", "");
       
        input = input.toLowerCase();
       
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        return input;
    }

    public boolean isPalindrome(String s) {
        String str = cleanString(s);
        for(int i=0; i<(str.length())/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}