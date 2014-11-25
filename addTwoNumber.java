import java.util.*;
public class addTwoString {


		public static void main(String args[]){
			String a = "12345";
			String b = "2345";
			StringBuffer bu = new StringBuffer();
			recursionHelper(a.length()-1,b.length()-1, a, b, 0,bu);
			System.out.print(bu);
		}
		public static void recursionHelper(int indexa, int indexb, String a, String b, int carry,StringBuffer bu){
			int value = carry;
			if(indexa < 0 && indexb < 0){
				return ;
			}
			if(indexa >= 0){
				
				value += a.charAt(indexa)-'0';
				indexa--;
			}
			if(indexb >= 0){
			
				value += b.charAt(indexb)-'0';
				indexb--;
			}
			
			carry = value/10;
			System.out.println("the value is"+value+"the carry is "+carry);
			System.out.println((char)(((int)'0')+value%10));
			bu.append((char)(((int)'0')+value%10));
			// number 0 to char 0!!!
		
			recursionHelper(indexa, indexb,a, b,carry, bu);

		}

}
