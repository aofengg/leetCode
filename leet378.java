// 先用优先队列存第一行，然后开始找第k个元素。
// 每次弹出一个元素，就要插入一个当前可能剩下的里面最小的元素。
public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
		for(int j = 0; j <= n-1; j++)
			pq.offer(new Tuple(0, j, matrix[0][j]));
		for(int i = 0; i < k-1; i++) {
			Tuple t = pq.poll();
			if(t.x == n-1) continue;
			pq.offer(new Tuple(t.x+1, t.y, matrix[t.x+1][t.y]));
		}
		return pq.poll().val;
	}
	
	class Tuple implements Comparable<Tuple> {
		int x, y, val;
		public Tuple(int xIn, int yIn, int valIn) {
			this.x = xIn;
			this.y = yIn;
			this.val = valIn;
		}
		@Override
		public int compareTo(Tuple o) {
			return this.val - o.val;
		}
		
	}
}


public int kthSmallest(int[][] matrix, int k) {
		int lo = matrix[0][0];
		int hi = matrix[matrix.length-1][matrix[0].length-1] + 1;
		while(lo < hi) {
			int mid = lo + (hi-lo)/2;
			int count = 0;
			int j = matrix[0].length - 1;
			for(int i = 0; i < matrix.length; i++) {
				while(j >= 0 && matrix[i][j] > mid)
					j--;
				count += (j + 1);
			}
			if(count < k) 
				lo = mid + 1;
			else
				hi = mid;
		}
		return lo;
	}

