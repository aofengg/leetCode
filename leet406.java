public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            }    
        });
        int length = people.length;
        ArrayList<int[]> temp = new ArrayList<>();
        for(int i = 0; i < length; i++) {
            temp.add(people[i][1], people[i]);
        }
        return temp.toArray(new int[length][2]);
    }
}