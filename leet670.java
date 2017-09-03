public int maximumSwap(int num) {
	String s = "" + num;
	char[] res = s.toCharArray();
	char[] temp = s.toCharArray();
	Arrays.sort(temp);
	int length = temp.length;
	int leftIndex = 0;
	char needToChange = '*';
	for (int i = 0; i < length; i++) {
		if (res[i] != temp[length - 1 - i]) {
			leftIndex = i;
			needToChange = temp[length - 1 - i];
			break;
		}
	}

	for (int i = length - 1; i >= 0; i--) {
		if (res[i] == needToChange) {
			char tem = res[i];
			res[i] = res[leftIndex];
			res[leftIndex] = tem;
		}
	}
	if (needToChange == '*') {
		return num;
	} else {
		return Integer.parseInt(String.valueOf(res));
	}
}