
public class aofbsqure2 {
	public static void main(String args[]){
		System.out.print(square(10,3));
		
	}
	public static int square(int a ,int b){
		if(b == 0){
			return 1;
		}
		if(b == 1){
			return a;
		}
		int result = square(a, b/2);
		if(b/2 == 1){
			return result*result*a;
		}
		return result*result;
	}
}
