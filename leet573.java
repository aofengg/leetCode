public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
	int res = 0;
	if (nuts.length == 1) {
		res += Math.abs(nuts[0][0] - tree[0]) + Math.abs(nuts[0][1] - tree[1]);
		res += Math.abs(nuts[0][0] - squirrel[0]) + Math.abs(nuts[0][1] - squirrel[1]);
		return res;
	}
	int closest = 0;
	for (int i = 1; i < nuts.length; i++) {
		// one nut
		int a = Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]);
		int d = Math.abs(nuts[i][0] - squirrel[0]) + Math.abs(nuts[i][1] - squirrel[1]);
		// another nut
		int b = Math.abs(nuts[closest][0] - tree[0]) + Math.abs(nuts[closest][1] - tree[1]);
		int c = Math.abs(nuts[closest][0] - squirrel[0]) + Math.abs(nuts[closest][1] - squirrel[1]);
		// draw a picture to compare
		if ((c + a) > (b + d)) {
			closest = i;
		}
	}
	res += Math.abs(nuts[closest][0] - squirrel[0]) + Math.abs(nuts[closest][1] - squirrel[1]);
	res += Math.abs(nuts[closest][0] - tree[0]) + Math.abs(nuts[closest][1] - tree[1]);
	nuts[closest][0] = tree[0];
	nuts[closest][1] = tree[1];
	for (int i = 0; i < nuts.length; i++) {
		res += (Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1])) * 2;
	}
	return res;
}