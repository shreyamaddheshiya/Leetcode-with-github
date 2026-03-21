class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(current=='(' || current=='[' || current=='{'){
                st.add(current);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.peek();
                st.pop();
                if((current==')' && ch=='(') || (current==']' && ch=='[') || (current=='}' && ch=='{')){
                }else{
                return false;
            }
        }
    }
        return st.isEmpty();
    }
}