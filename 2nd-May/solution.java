public class Solution {
    public int numJewelsInStones(String J, String S) {
        int sl = S.length();
        int jl = J.length();
        int i, res = 0;
        for (i=0; i<sl; i++) {
            if (J.indexOf(S.charAt(i)) != -1)
                res++;
        }
        return res;
    }
}
