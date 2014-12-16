import java.util.*;
public class checkDead {
	public static void main(String args[]){
		char[][] board = {
		{'0','0','0','1',' '},
		{'1','1','0','1',' '},
		{'1','1','0','1',' '},
		{'1','1',' ','1',' '},
		};
		System.out.print(check(board,0,0));
	}
	static HashSet<String>  set = new HashSet<String>();
	public static boolean check(char[][] board, int x, int y) {
		String temp = x+"+"+y;
		if(set.contains(temp)){
			return false;
		}else{
			set.add(temp);
		}

		if(x < 0|| x >= board[0].length || y < 0 || y >= board.length || board[x][y] == '1'){
			return false;
		}
		if(board[x][y] == ' '){
			return true;
		}
		boolean up = check(board, x+1, y);
		boolean down = check(board, x-1, y);
		boolean left = check(board, x, y-1);
		boolean right = check(board, x,y+1);
		return up||down||left|| right;

	}
}
