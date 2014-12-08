import java.util.*;
public class closeIndex {
	public static void main (String args[]) {
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("a");
		temp.add("a");
		temp.add("a");
		temp.add("b");
		temp.add("d");
		temp.add("d");
		temp.add("a");
		System.out.print(parse(temp,"a","d"));
	}
	public static int parse (ArrayList<String> temp,String target, String target1) {
		int a = -1;
		int b = -1;
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < temp.size(); i++){
			if(temp.get(i).equals(target)){
					if(b != -1 &&Math.abs(i-b) < result){
						result = Math.abs(i-b);
					
					}
					  a = i;
			}else if (temp.get(i).equals(target1)){
				if(a != -1 &&Math.abs(i-a) < result){
					result = Math.abs(i-a);
				
				}
				  b = i;
			}
		}
		return result;
	}
}
