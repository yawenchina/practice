import java.util.*;
public class multiflyString {
	public static void main(String args[]){
		String a = "12345";
		String b = "2345";
		int result = 0;
		for(int i = b.length()-1; i >= 0;i--) {
			int carry =0;
			int value = 0;
			int time = 0;
			int res = 0;
			int number = b.charAt(i)-'0';
			for(int j = a.length()-1; j >= 0;j--){
				//System.out.println(number);
				int cur = a.charAt(j)-'0';
				//System.out.print(cur);
				value = number*cur+carry;
				carry = value/10;
				res += value%10*Math.pow(10,time++);
			}
			System.out.println(res);
			result +=res*Math.pow(10,b.length()-1-i);
		}
		System.out.print(result);
	}
	
}
