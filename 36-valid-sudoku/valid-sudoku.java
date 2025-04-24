class Solution {
    public boolean isValidSudoku(char[][] board) {
     
     Map<Integer, Set<Character>> rows = new HashMap<>();
     Map<Integer, Set<Character>> cols = new HashMap<>();
     Map<String, Set<Character>> squares = new HashMap<>();
     for(int r = 0; r < 9; r++){
        for(int c = 0; c < 9; c++){
            char value = board[r][c];
            if(value == '.'){
                continue;
            }
            String squareKey = (r/3) + "-" + (c/3);

            rows.putIfAbsent(r, new HashSet<>());
            cols.putIfAbsent(c, new HashSet<>());
            squares.putIfAbsent(squareKey, new HashSet<>());

            if(rows.get(r).contains(value) ||
            cols.get(c).contains(value) ||
            squares.get(squareKey).contains(value)){
                return false;
            }

            rows.get(r).add(value);
            cols.get(c).add(value);
            squares.get(squareKey).add(value);

        }

     }
     return true;
    }
}