public class Solution {
    public int findComplement(int num) {
        int result = num;
        int copy = num;
        int mark = 1;
        while (copy > 0) {
            result = result ^ mark;
            copy = copy >> 1;
            mark = mark << 1;
        }
        return result;
    }
}