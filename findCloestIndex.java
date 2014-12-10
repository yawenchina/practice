import java.util.*;
public class closestIndex {
		public static void main (String args[]) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add("a");
			temp.add("a");
			temp.add("m");
			temp.add("b");
			temp.add("d");
			temp.add("d");
			temp.add("m");
			temp.add("a");
			System.out.print(parse(temp,"a","d"));
		}
		public static int parse (ArrayList<String> temp,String target, String target1) {
			ArrayList<Integer> array1 = new ArrayList<Integer>();
			ArrayList<Integer> array2 = new ArrayList<Integer>();
			for(int i = 0; i < temp.size(); i++){
				if(temp.get(i).equals(target)){
					array1.add(i);
				}else if(temp.get(i).equals(target1)){
					array2.add(i);
				}
			}
			print(array1);
			print(array2);
			int j = 0;
			int k = 0;
			int index = Integer.MAX_VALUE;
			while(j < array1.size() && k < array2.size()){
				index = Math.min(index,Math.abs(array1.get(j)-array2.get(k)));
				System.out.println(array1.get(j));
				System.out.println(array2.get(k));
				if(index == 1)return index;
				if(array1.get(j) < array2.get(k)){
					j++;
				}else{
					k++;
				}
			}
			
			return index;
		}
		public static void print(ArrayList<Integer> temp){
			for(int t : temp){
				System.out.print(t);
			}
			System.out.println();
		}

}
