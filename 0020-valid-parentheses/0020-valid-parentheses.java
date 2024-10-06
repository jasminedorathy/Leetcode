class Solution {
    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<brackets.length;i++){
            if(brackets[i] == '(' 
            || brackets[i] == '{'
             || brackets[i]=='['){
                stack.push(brackets[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if((brackets[i] == '}' && stack.peek() != '{')
                || (brackets[i] == ']' && stack.peek() != '[')
                || (brackets[i] == ')' && stack.peek() != '(')){
                    return false; // return false if the brackets don't match.
                }else{
                   stack.pop(); // pop() if a match is found.
                }
            }
        }
        return stack.isEmpty(); //  true if all the brackets match, false otherwise.
    }
}