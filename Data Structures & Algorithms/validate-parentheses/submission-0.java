class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='{'){
                stack.push('}');
            }
            else if(ch=='['){
                stack.push(']');
            }
            else if(ch=='('){
                stack.push(')');
            }
            else if(stack.isEmpty() || stack.pop()!=s.charAt(i)){
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
