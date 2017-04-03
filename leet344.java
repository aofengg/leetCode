class Solution {
public:
    string reverseString(string s) {
        string answer = "";
        for(int i = s.size()-1; i >= 0; i--) {
            answer += s[i];
        }
        return answer;
    }
};