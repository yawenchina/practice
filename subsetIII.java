import java.util.*;
public class dividePart {
	static int target = 0;
	static int result = 0;
	public static ArrayList<Integer> num ;
	public static void main(String args[]){
		int[] size = {1,2,3,5,7};
		int sum = 0;
		for(int num : size){
			sum += num;
		} 
		  target= sum/2;
		  System.out.print(target);
		print(divide(size));
	}
	public static void print(ArrayList<Integer> result){
		for(int m : result){
			System.out.println(m);
		}
		System.out.println();
	}
	public static ArrayList<Integer> divide(int[] size){
		
		
	ArrayList<Integer> temp = new ArrayList<Integer>();
	 num = new ArrayList<Integer>();
	if(size == null || size.length <= 1){
		return num;
	}
	  result =size[0];
	divideHelper( size, temp, 0,0);
	return num;

	}

	public static void divideHelper( int[] size, ArrayList<Integer> temp, int temp_sum, int index){
		if(temp.size() > size.length/2){
			return ;
		}
		if(temp.size() == size.length/2){
			if(temp_sum == target){
				num = new ArrayList<Integer>(temp);
				//print(num);
				return ;

			}else if(Math.abs(temp_sum - target) < Math.abs(result- target)){
				result = temp_sum;
				num = new ArrayList<Integer>(temp);
				//print(num);

			}
	
		}
		if(index < size.length){
		divideHelper( size, temp, temp_sum,index+1);
		temp.add(size[index]);
		divideHelper( size, temp, temp_sum+ size[index],index+1);
		temp.remove(temp.size()-1);
		}else{
			return;
		}
	}

}
