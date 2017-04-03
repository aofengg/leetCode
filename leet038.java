class Solution {
public:
    string countAndSay(int n) {
        string answer = "1";
        for(int i = 0; i < n - 1; i++){
            string next = "";
            int start = 0;
            while(start < answer.size()) {
                int count = 0;
                int end = start;
                while(answer[start] == answer[end] && end < answer.size()) {
                    count++;
                    end++;
                }
                next += char('0' + count);
                next += answer[start];
                start = end;
            }
            answer = next;
        }
        return answer;
    }
};