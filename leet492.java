public class Solution {
    public int[] constructRectangle(int area) {
        int l = (int)Math.ceil(Math.sqrt(area));
        while((area % l) != 0) {
            l++;
        }
        int[] res = new int[2];
        res[0] = l;
        res[1] = area / l;
        return res;
        
    }
}