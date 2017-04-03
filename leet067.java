public class Solution {
    public String addBinary(String a, String b) {
        if(a.isEmpty() || a == null) {
            return b;
        }
        if(b.isEmpty() || b == null) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        int i = aArray.length - 1;
        int j = bArray.length - 1;
        StringBuilder res = new StringBuilder();
        int aByte, bByte;
        int carry = 0;
        int result;
        while (i > -1 || j > -1 || carry > 0) {
            aByte = i > -1 ? Character.getNumericValue(aArray[i--]) : 0;
            bByte = j > -1 ? Character.getNumericValue(bArray[j--]) : 0;
            result = aByte ^ bByte ^ carry;
            carry = (carry + aByte + bByte) >= 2 ? 1 : 0;
            res.append(result);
        }
        return res.reverse().toString();
        
    }
}