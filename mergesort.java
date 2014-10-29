import java.util.*;
public class mergeSort {
	public static void main(String args[]){
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(7);
		result.add(6);
		result.add(5);
		result.add(4);
		result.add(3);
		result.add(2);
		result.add(1);
		ArrayList<Integer> res = merge(result, 0, result.size()-1);
		print(res);

	}
	public static void print(ArrayList<Integer> res){
		for(int one:res){
			System.out.println(one);
		}
	}
	public static ArrayList<Integer> merge(ArrayList<Integer> result,int first, int last){
		ArrayList<Integer> m = new ArrayList<Integer>();
		if(first == last){
			m.add(result.get(first));
			return m;
		}
		if(first > last){
			return m;
		}
		ArrayList<Integer> f = merge(result,first,first+(last-first)/2);
		ArrayList<Integer> s = merge(result,first+(last-first)/2+1, last);

		return combine(f,s);

	}
	public static ArrayList<Integer> combine(ArrayList<Integer> first, ArrayList<Integer> second){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i = 0; 
		int j = 0;
		while(i < first.size() && j < second.size()){
			if(first.get(i) < second.get(j)){
				result.add(first.get(i));
				i++;
			}else{
				result.add(second.get(j));
				j++;
			}

		}
		while(i < first.size()){
			result.add(first.get(i));
				i++;
		}
		while(j< second.size()){
			result.add(second.get(j));
				j++;
		}
		return result;
	}

}
