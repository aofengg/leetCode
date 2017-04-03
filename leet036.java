public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] used1 = new int[9][9];
		int[][] used2 = new int[9][9];
		int[][] used3 = new int[9][9];
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++) {
			    if(board[i][j] != '.'){
				    int num = board[i][j]  - '0' - 1, k = i / 3 * 3 + j / 3;
				    if(used1[i][num] == 1 || used2[j][num] == 1 || used3[k][num] == 1) {
					    return false;
				    }
				    used1[i][num] = 1;
				    used2[j][num] = 1;
				    used3[k][num] = 1;
			    }
			}
		}
		return true;
    }
}