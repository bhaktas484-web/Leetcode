class Solution {
    public void rotate(int[][] matrix) {
        int sRow=0;
        int eRow=matrix.length-1;
        int sCollum=0;
        int eCollum=matrix[0].length-1;
        List<List<Integer>> list =new ArrayList<>();
        while(sCollum<=eCollum){
            List<Integer> templist =new ArrayList<>();
            for(int i=eRow;i>=sRow;i--){
                templist.add(matrix[i][sCollum]);
            }
            list.add(templist);
            sCollum++;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=list.get(i).get(j);
            }
        }
    }
}