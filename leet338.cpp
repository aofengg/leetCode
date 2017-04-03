class Solution {
public:
    vector<int> countBits(int num) {
       vector<int> answer;
        int temp = 0;
        answer.push_back(temp);
        if (num == 0)
            return answer;

        temp = 1;
        answer.push_back(temp);
        if (num == 1)
            return answer;

        int exp = 0;
        for (int i = 2; i <= num; i++) {
            if (i < pow(2, exp+1)) {
                temp = answer[i-pow(2, exp)] + 1;
                answer.push_back(temp);
            }
            else if (i == pow(2, exp+1)) {
                exp++;
                temp = answer[i-pow(2, exp)] + 1;
                answer.push_back(temp);
            }
        }
        return answer; 
    }
};