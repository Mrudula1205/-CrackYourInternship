class Solution {
    public boolean isValid(String s) {
        Stack<String> par = new Stack<>();
        if (s.charAt(0)==']' | s.charAt(0)==')' | s.charAt(0)=='}')
            return false;
        else{
            for (int i=0; i<s.length(); i++){
                switch(s.charAt(i)){
                    case '(' : par.push("("); break;
                    case '[' : par.push("["); break;
                    case '{' : par.push("{"); break;
                    case ')' : if(!par.empty() && par.peek().equals("(") ) par.pop(); else return false; break;
                    case ']' : if(!par.empty() && par.peek().equals("[") ) par.pop(); else return false; break;
                    case '}' : if(!par.empty() && par.peek().equals("{") ) par.pop(); else return false; break;
                }
            }
            return par.empty();
        }
    }
}