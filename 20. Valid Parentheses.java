class Solution {
    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> ch = new Stack<>();
        for(char brac : brackets){
            switch (brac){
                case '{' : ch.push('}'); break;
                case '(' : ch.push(')'); break;
                case '[' : ch.push(']'); break;
                default : 
                    if(ch.empty() || brac != ch.peek())
                        return false;
                    ch.pop();
            }
        }
        return ch.empty();
    }
}
