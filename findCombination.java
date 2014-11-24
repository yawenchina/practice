import java.util.*;
public class recursion {
	public static void main(String args[]){
		print(findCombination(4,3));
		
	}
	public static void print(ArrayList<ArrayList<Integer>> result) {
		System.out.println("the size is"+result.size());
		for(ArrayList<Integer> temp : result){
			for(int m : temp){
				System.out.print(m);
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>>  findCombination (int n , int k ) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (k == 0) {
			return result;
	}
	combinationHelper(n,  k, new ArrayList<Integer>(),result);
	return result;
	}
	public static void combinationHelper (int n, int k, ArrayList<Integer>  temp, ArrayList<ArrayList<Integer>> result) {
		if(k == 1){
			temp.add(n);
			result.add(new ArrayList<Integer>(temp));
			temp.remove(temp.size()-1);
			return ;
	}
	temp.add(n);
	combinationHelper(n+1, k-1, temp, result);
	combinationHelper(n-1, k-1, temp, result);
	temp.remove(temp.size()-1);
	}



}
