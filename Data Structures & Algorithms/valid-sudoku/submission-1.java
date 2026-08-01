class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i ++) {
            Set<Character> seen = new HashSet<>();
            for( int j = 0 ; j < 9 ; j ++) {
                if(board[i][j] == '.') {
                    continue;
                }
                if(seen.contains(board[i][j])) {
                    return false;
                } 
                seen.add(board[i][j]);
            }
        }
        for(int i = 0; i < 9; i ++) {
            Set<Character> seen = new HashSet<>();
            for( int j = 0 ; j < 9 ; j ++) {
                if(board[j][i] == '.') {
                    continue;
                }
                if(seen.contains(board[j][i])) {
                    return false;
                } 
                seen.add(board[j][i]);
            }
        }
        for(int i = 0; i < 9 ; i += 3) {
            for (int j = 0 ;j < 9; j += 3) {
                Set<Character> seen = new HashSet<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                    if(board[k][l] == '.') {
                    continue;
                }
                if(seen.contains(board[k][l])) {
                    return false;
                } 
                seen.add(board[k][l]);
                    }
                }
            }
        }
        return true;
    }
}
