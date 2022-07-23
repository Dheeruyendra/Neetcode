class Solution {

    public String reverseWords(String s) {
        int i = 0;

        int n = s.length(); // size of string;

        String res = new String();

        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i += 1;
            }
            if (i >= n) break;

            int j = i + 1;

            while (j < n && s.charAt(j) != ' ') {
                j += 1;
            }
            
           

            if (res.length() == 0) {
               
                res = s.substring(i, j);
            } else {
               
                res = s.substring(i, j) + " " + res;
            }

            i = j + 1;
        }

        return res;
    }
}
