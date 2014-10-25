
import java.io.*;
import java.util.*;
public class whitepages {
	public static void main(String args[]) throws Exception {
		//use bufferReader to read the input 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> input = new ArrayList<Integer>();
		String line = null;
		while ((line = br.readLine()) != null) {
			input.add(Integer.parseInt(line.trim()));
		}
		
		if (input.isEmpty()) {
			System.out.println("failure");
		} else {
			System.out.println(minJump(input));
		}
	}
	public static void print(ArrayList<Integer> m){
		for(int n: m){
			System.out.print(n);
		}
	}
	private static String minJump(ArrayList<Integer> input) {
		int[] minJump = new int[input.size()];
		int[] backIndex = new int[input.size()];
		for (int i = 1; i < input.size(); i++) {
			minJump[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (minJump[j] != Integer.MAX_VALUE && input.get(j) + j >= i
						&& minJump[j] + 1 < minJump[i]) {
					minJump[i] = minJump[j] + 1;
					backIndex[i] = j;
				}
			}
		}
		if (minJump[input.size() - 1] == Integer.MAX_VALUE) {
			return "failure";
		}
		StringBuilder solution = new StringBuilder();
		int index = input.size() - 1;
		while (index != 0) {
			solution.append(",").append(index);
			index = backIndex[index];
		}
		return solution.append(",").append(0)
				.reverse().append("out").toString();
	}


}
