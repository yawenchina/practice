import java.util.*;
public class checkTwoDup {
	public static void main(String args[]){
		int[] input = {1,2,1,3,4,5,2};
		print(getRepeat(input));
	}
	public static void print(ArrayList<Integer> in){
		if(in == null || in.size() == 0){
			return ;
		}
		for(int one : in){
			System.out.print(one);
		}
	}
	public static ArrayList<Integer> getRepeat(int[] input )
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(input == null || input.length == 1){
			return res;
		}
		for(int i = 0; i < input.length ;i++)
		{
			int index = Math.abs(input[i]);
			if(input[index-1] < 0)
			{
				res.add(-input[index-1]);
				if(res.size() == 2)
				{
					return res;
				}
			}else{
				input[index-1] = -input[index-1];
			}
	
		}
		return res;
	}

}

