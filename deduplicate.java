
public class deduplicate {
	public static void main(String args[]){
		String m = "aaaabbbcccddde";
		char[] array = m.toCharArray();
		System.out.print(deduplicate(array));
	}
	public static String deduplicate(char[] array){
		StringBuffer bu = new StringBuffer();
		char c = array[0];
		int j  = 1;
		while(j < array.length){
			if(array[j] != c){
				bu.append(c);
				c = array[j];

			}
			j++;
		}
		bu.append(c);
		return bu.toString();
	}

}
