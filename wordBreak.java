
import java.util.*;
public class wordBreak {
	public static void main(String args[]){
		String input = "applemeeat";
		HashSet<String>  set = new HashSet<String>();
		set.add("apple");
		set.add("mee");
		set.add("me");
		set.add("eat");
		set.add("t");
		System.out.print(find(set, input));
		
	}
	public static boolean find(HashSet<String> set, String input){
		boolean[] check = new boolean[input.length()+1];
		check[0] = true;
		for(int i = 0;  i < input.length()+1; i++){
			if(check[i]){
				for(String m: set){
					int len = m.length();
					if(i+len > input.length()){
						continue;
					}
					if(input.substring(i, i+len).equals(m)){
						check[i+len] = true;
					}
				}
			}
		}
		for(boolean m : check){
			System.out.print(m+" ");
		}
		System.out.println();
		return check[input.length()];
	}
}
