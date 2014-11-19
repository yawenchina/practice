
public class interleaving {
	public static void main(String args[]){
		String a = "sadjkflajsglk";
		String b = "aeajsk";
		String c = "aajske";
		System.out.println(isInterleave(a,b));
		System.out.println(isInterleave(a,c));
		
	}
	public static boolean isInterleave(String a, String b){
		int i = 0;
		int j = 0;
		while(i < a.length() && j < b.length()){
			if(a.charAt(i) == b.charAt(j)){
				i++;
				j++;
			}else{
				i++;
			}
		}
		if(j == b.length()){
			return true;
		}
		return false;
	}
}
