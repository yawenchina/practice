
public class Palidrom {
	public static void main(String args[]){
		int m = 3;
		int n = 7;
		int p = 8;
		System.out.print(checkPalindrom(m));
		System.out.print(checkPalindrom(n));
		System.out.print(checkPalindrom(p));

	}
	public static boolean checkPalindrom(int m){
		if(m%2 == 0){
			return false;
		}
		StringBuffer bu = new StringBuffer();
		while(m != 0){
			
			bu.append(m&1);
			m >>= 1;
		}
		String s = bu.toString();
		int i = 0;
		int j = s.length()-1;
		while(i<=j){
			if(s.charAt(i++)!= s.charAt(j--)){
				return false;
			}
		}
		

		return true;
	}
}
