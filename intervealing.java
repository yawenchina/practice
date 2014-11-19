import java.util.*;
public class intervealingString {
	public static void main(String args[]){
		String a = "sadjkflajsglk";
		String b = "aajsk";
		String c = "aajske";
		System.out.println(isInterleave(a,b));
		System.out.println(isInterleave(a,c));
		
	}
	public static boolean isInterleave(String a, String b){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char m : a.toCharArray()){
			if(!map.containsKey(m)){
				map.put(m,1);
			}else{
				map.put(m, map.get(m)+1);
			}
		}
		for(char n : b.toCharArray()){
			if(!map.containsKey(n)){
				return false;
			}else{
				map.put(n, map.get(n)-1);
			}
		}
		return true;
	}
}
