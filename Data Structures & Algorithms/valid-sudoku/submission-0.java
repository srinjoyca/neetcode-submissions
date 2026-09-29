class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        HashSet<Character>[] rows = new HashSet[len];
        HashSet<Character>[] cols = new HashSet[len];
        HashSet<Character>[] boards = new HashSet[len];
        for (int i = 0; i < len; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boards[i] = new HashSet<>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                
              
                char cur = board[i][j];
                if (cur == '.') {
                    continue;
                }
                int boardIndex = i/3*3+j/3;
                
                if (rows[i].contains(cur) || cols[j].contains(cur) || boards[boardIndex].contains(cur)) {
                    return false;
                }
                rows[i].add(cur);
                cols[j].add(cur);
                boards[boardIndex].add(cur);

            }
        }

        return true;
    }
}
