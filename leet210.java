public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] order = new int[numCourses];
		int index = 0;
		int[][] matrix = new int[numCourses][numCourses];
		int[] indegree = new int[numCourses];
		for (int i = 0; i < prerequisites.length; i++) {
			int ready = prerequisites[i][0];
			int pre = prerequisites[i][1];
			indegree[ready]++;
			matrix[pre][ready] = 1;
		}
		Queue<Integer> queue = new LinkedList();
		for (int i = 0; i < indegree.length; i++) {
			if (indegree[i] == 0)
				queue.offer(i);
		}
		while (!queue.isEmpty()) {
			int course = queue.poll();
			order[index] = course;
			index++;
			for (int i = 0; i < numCourses; i++) {
				if (matrix[course][i] == 1) {
					indegree[i]--;
					if (indegree[i] == 0)
						queue.offer(i);
				}
			}
		}
		return index == numCourses ? order : new int[0];
    }
}