
public class printBinary {
	public static void main(String args[]){
		printBinary(0,32);
		printBinary(5,32);
		printBinary(Integer.MIN_VALUE,32);
		printBinary(Integer.MAX_VALUE,32);
	}
	public static void printBinary(int number, int shift){
		StringBuffer bf = new StringBuffer();
		while(shift >= 0){
			bf.append(number&1);
			number = number>>1;
			shift--;
		}
		System.out.println(bf.reverse().toString());
	}
}
