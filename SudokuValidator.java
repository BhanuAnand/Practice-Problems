import java.util.*;

public class SudokuValidator {
    public static void main(String args[]) {
      char[][] board = { { '5', '1', '.', '.', '7', '.', '.', '.', '.' }, 
                         { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, 
                         { '.', '9', '6', '.', '.', '.', '.', '6', '.' }, 
                         { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
                         { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, 
                         { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
                         { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, 
                         { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
                         { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

      System.out.println(isValidSudoku(board));
    }
    
    public static boolean isValidSudoku(char[][] board) {
        
        if(notInRow(board) && notInColumn(board) && notInGrid(board)){
            return true;
        }
        
        return false;
    }
    
    public static boolean notInRow(char[][] board){
        for(int row=0; row<9; row++){
            HashSet<Character> set = new HashSet<>();
            for(int col=0; col<9; col++){
                if(board[row][col]!='.'){
                    if(set.contains(board[row][col])){
                        return false;
                    }else{
                        set.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }
    
    public static boolean notInColumn(char[][] board){
       for(int col=0; col<9; col++){
            HashSet<Character> set = new HashSet<>();
            for(int row=0; row<9; row++){
                if(board[row][col]!='.'){
                    if(set.contains(board[row][col])){
                        return false;
                    }else{
                        set.add(board[row][col]);
                    }
                }
            }
        }
       return true; 
    }
    
    public static boolean notInGrid(char[][] board){
       
        for(int cnt=0; cnt<9; cnt++){
             int row = 0;
            int col = 0;
            if(cnt==1){
                col=3;
            } else if(cnt==2){
                col=6;
            } else if(cnt==3){
                row=3;
            } else if(cnt==4){
                row=3;
                col=3;
            } else if(cnt==5){
                row=3;
                col=6;
            } else if(cnt==6){
                row=6;
            } else if(cnt==7){
                row=6;
                col=3;
            } else if(cnt==8){
                row=6;
                col=6;
            }
            
            checkInOneGrid(row,col,board);
        }
        return true;
    }
    
    public static boolean checkInOneGrid(int i,int j,char[][] board){
        HashSet<Character> set = new HashSet<>();
        for(int row=i; row<i+3; row++){
            for(int col=j; col<j+3; col++){
                if(board[row][col]!='.'){
                    if(set.contains(board[row][col])){
                        return false;
                    }else{
                        set.add(board[row][col]);
                    }
                }
            }
        }
       return true;
    }
}
