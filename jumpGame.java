 import java.io.*;
import java.util.*;

	public static void main(String[] args) throws java.lang.Exception {
		//use bufferReader to read the input 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputs = br.readLine();
		ArrayList<Integer> input = new ArrayList<Integer>();

		if (inputs == null || inputs.size() == 0) {
			System.out.print("failure");
			return;
		} else {
			try {
				input.add(Integer.parseInt(inputs));
			} catch (Exception e) {
				System.out.println("failure");
				return;
			}
			while ((inputs = br.readLine()) != null) {
				try {
					input.add(Integer.parseInt(inputs));
				} catch (Exception e) {
					System.out.println("failure");
					return;
				}

				if (inputs.equals("")) {
					break;
				}
			}

		}
		int[] steps = new int[input.size()];
		//use hashmap to store the every jump procetrue;
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
	
		steps[0] = 0;
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(0);
		map.put(0, temp1);
		for (int i = 1; i < input.size(); i++) {
			steps[i] = Integer.MAX_VALUE;
			for (int j = 0; j < i; j++) {
				if (steps[j] != Integer.MAX_VALUE && j + input.get(j) >= i) {
					steps[i] = steps[j] + 1;

					ArrayList<Integer> temp = map.get(j);
					ArrayList<Integer> temp2 = new ArrayList<Integer>();
					for (int m : temp) {
						temp2.add(m);
					}
					temp2.add(i);
					map.put(i, temp2);
					//remove the key();
					break;
				}
			}
		}

		if (map.containsKey(input.size() - 1)) {
			ArrayList<Integer> array = map.get(input.size() - 1);
			for (int m : array) {
				System.out.print(m + ", ");
			}
			System.out.print("out");
		} else {
			System.out.print("failure");
		}

	}

