
public class reverseString {
	public static void main(String args[]){
		String m = "I have a dream";
		char[] array = m.toCharArray();
		int start = 0;
		int end = m.length()-1;
		while(start < end){
			char temp = array[start];
			array[start++] = array[end];
			array[end--] = temp;
		}
		System.out.println(new String(array));
		System.out.println(new StringBuilder(new String(array)).reverse().toString());
	}
}
