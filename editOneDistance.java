
public class oneditDistance {
	public static void main(String args[]){
		String m = "abcdefgs";
		String n = "abcdefg";
		String a = "abcdmfgs";
		String b = "abcdnefgs";
		System.out.println(check(m, n));
		System.out.println(check(m,a));
		System.out.println(check(m,b));
	}
	public static boolean check(String s, String t){
		int m = s.length(), n = t.length();
		   if (m > n) return check(t, s);
		   if (n - m > 1) return false;
		   int i = 0, shift = n - m;
		   while (i < m && s.charAt(i) == t.charAt(i)) i++;
		   if (i == m) return shift > 0;
		   if (shift == 0) i++;
		   while (i < m && s.charAt(i) == t.charAt(i + shift)) i++;
		   return i == m;
	}
}
