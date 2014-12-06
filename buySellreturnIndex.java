
import java.util.*;
public class buyAndSellStcok {
	public static void main(String args[]){
		int[] stocks = {1,3,3,5,2,0};
		print(buySell(stocks));
	}
	public static void print(ArrayList<Integer> result){
		for(int t : result){
			System.out.print(t);
		}
	}
	public static ArrayList<Integer> buySell(int[] stocks){
		int first = 0;
		int last = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (stocks == null || stocks.length <= 1){
			return result;
	}
		int min = stocks[0];
		int local_first = 0;
		int max = 0;
		for(int i = 1; i < stocks.length; i++){
			if (stocks[i] < min) {
				local_first = i;
				min = stocks[i];
	}
	if ((stocks[i] - min) >= max){
		last = i;
		max = stocks[i] - min;
		if(stocks[local_first] < stocks[first]){
			first = local_first;
	}
	}
	}
	if(first != last){
		result.add(first);
		result.add(last);
	}
		return result;
	}

}
