class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (st1.length() > 0) {
                    st1.deleteCharAt(st1.length() - 1);
                } 
            } 
            else {
                st1.append(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (st2.length() > 0) {
                    st2.deleteCharAt(st2.length() - 1);
                } 
            }
            else {
                st2.append(t.charAt(i));
            }
        }
        return st2.toString().equals(st1.toString());
        }
    }