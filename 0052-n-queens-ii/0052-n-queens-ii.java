class Solution {
     int count=0;
       public boolean isSafe(List<StringBuilder> board, int row, int col, int n) 
    {
        for (int i = 0; i < row; i++)
        {
            if (board.get(i).charAt(col) == 'Q')
            {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
        {
            if (board.get(i).charAt(j) == 'Q')
            {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < n; i--, j++)
        {
            if (board.get(i).charAt(j) == 'Q')
            {
                return false;
            }
        }
        return true;
    }

    public void nQueens( List<StringBuilder> board, int row, int n) 
    {
        if (row == n)
        {
            count++;
        }
        for (int j = 0; j < n; j++)
        {
            if (isSafe(board, row, j, n))
            {
                board.get(row).setCharAt(j, 'Q');
                nQueens( board, row + 1, n);
                board.get(row).setCharAt(j, '.');
            }
        }
    }
   public int totalNQueens(int n) {
        List<StringBuilder> board = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++)
            {
                row.append('.');
            }
            board.add(row);
        }
        nQueens( board, 0, n);
        return count;
    }
}