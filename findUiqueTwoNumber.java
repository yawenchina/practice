
public class findUiqueTwo {
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6,1,2,3,4};
		findTwo(array);
	}
	public static void findTwo (int[] array) {
		int value = 0;
		for (int temp : array) {
			value ^= temp;
	}
	int i = 0;
	int one = value & (~(value-1));

	int a = 0;
	int b = 0;
	for(int n : array){
		if ((one & n) == 0){
			a ^= n;
	}else{
		b ^= n;
	}
	}
	System.out.print(a);
	System.out.print(b);


	}

}
