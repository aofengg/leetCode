public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        return compute(input, new HashMap<String, List<Integer>>());
    }

    public List<Integer> compute(String input, Map<String, List<Integer>> map) {
        if(map.containsKey(input)) {
            return map.get(input);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            char oper = input.charAt(i);
            if(oper == '+' || oper == '-' || oper == '*'){
                List<Integer> result1 = compute(input.substring(0, i), map);
                List<Integer> result2 = compute(input.substring(i+1), map);
                int ans = 0;
                for(Integer i1 : result1) {
                    for(Integer i2 : result2) {
                        if(oper == '+') {
                            ans = i1 + i2;
                        } else if(oper == '-') {
                            ans = i1 - i2;
                        } else {
                            ans = i1 * i2;      
                        }
                        res.add(ans);
                    }
                }
            }
        }
        if(res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        map.put(input, res);
        return res;
    }
}