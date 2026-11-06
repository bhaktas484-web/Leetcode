class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k=0;k<4;k++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    public void rotate(int mat[][]){
     for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
            }
        }
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
}
    public boolean check(int[][]mat,int [][]target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(target[i][j]!=mat[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}