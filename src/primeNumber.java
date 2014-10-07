import java.util.*;
public class primeNumber {
	public static void main(String args[]){
		System.out.print(findPrime(12));
		System.out.print(findPrime(7));
		System.out.print(findPrime(23));
	}
	public static boolean findPrime(int m){
		for(int i = 2 ;i < Math.sqrt(m);i++){
			if(m % i == 0){
				return true;
			}
		}
		return false;
	}
}
