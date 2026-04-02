class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length()-1;
        while(n>=0){
            while(n >= 0 && s.charAt(n) ==' '){
                n--;
            }
            if (n < 0) break;
            int end = n;
            while(n >= 0 && s.charAt(n) !=' '){
                n--;
            }
            int start = n + 1;
            sb.append(s.substring(start, end + 1));
            sb.append(' ');

        }
        return sb.toString().trim();
    }
}