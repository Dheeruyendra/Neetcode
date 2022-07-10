class Solution {

    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS += 1;
                    i--;
                } else if (skipS > 0) {
                    skipS -= 1;
                    i--;
                } else break;
            }
        

      
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT += 1;
                    j--;
                } else if (skipT > 0) {
                    skipT -= 1;
                    j--;
                } else break;
            }
        
           if(i>=0 && j>=0 && s.charAt(i)!=t.charAt(j)) return false;
           if(i >=0 != j >=0)return false;
           i--;
           j--;
        
    }
        return true;
    }
}
