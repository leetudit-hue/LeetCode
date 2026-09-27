class Solution {
    boolean find(char[][]arr, String word , int i , int j , int idx){
        if(idx == word.length()) return true;
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == '$' || arr[i][j] != word.charAt(idx)) return false;
        char temp = arr[i][j];
        arr[i][j] = '$';
        boolean found = (find(arr,word,i+1,j,idx+1) || find(arr,word,i-1,j,idx+1) || find(arr,word,i,j+1,idx+1) ||find(arr,word,i,j-1,idx+1));
        arr[i][j] = temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0) && find(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
}