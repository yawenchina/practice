
public class getLength {
	public static void main(String args[]){
		String m = "   dsfasd dsfjaodsjf sdfasf fsdfasdfaf  dfas gmdklfgm";
		System.out.print(findLength(m));
	}
	public static int findLength (String input){
		if(input == null || input.length() == 0){
			return 0;
	}
		
		char[] array = input.toCharArray();
		int count = 0;
		boolean marker = false;
		int i = 0;
		for( i = 0; i < array.length;i++) {
			if ((i == 0 || !marker)&& !check(array[i])){
				count++;
				marker = true;
				continue;
			} 
			if (marker &&check(array[i])) {
		marker = false;
	}
			
	}

		return count;

	}
	public static boolean check (char cur){
		if(cur == ' '|| cur == '\n' || cur == '\t'){
		return true;
	}
	return false;

	}


}
