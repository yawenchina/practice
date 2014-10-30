import java.util.*;
public class KthSmallest {
	public static void main(String args[]){
		int[][] matrix = {
				{1, 3, 7, 8}, 
				{3, 5, 9, 13}, 
				{4, 6, 10, 14}, 
				{6, 8, 12, 15}
		};
		ArrayList<Integer> result = find(matrix, 6);
		
		
	}
	public static ArrayList<Integer> find(int[][] matrix, int number){
		ArrayList<Integer> result = new ArrayList<Integer>();
		int col = matrix.length;
		int row = matrix[0].length;
		PriorityQueue<Entry> pq = new PrioriryQueue<Entry>(number*2, new Comparator(){
			public int compare(Entry m, Entry n){
				return m.value-n.value;
			}



		});
		Entry a = new Entry(0,0,matrix[0][0]);
		pq.offer(a);
		HashMap<Entry, Boolean> map = new HashMap<Entry, Boolean>();
		map.put(a,true);
		int times = 0;
		while(times < number && !pq.isEmpty()){
			Entry entry = pq.poll();
			result.add(entry.val);
			int i = entry.x;
			int j = entry.y;
			if(i+1 < row){
				Entry entry1 = new Entry(i+1, j, matrix[i+1][j]);
				if(!map.containsKey(entry1)){
					map.put(entry1, true);
					pq.add(entry1);
				}
			}
			if(j+1 < col){
				Entry entry2 = new Entry(i, j+1, matrix[i][j+1]);
				if(!map.containsKey(entry2)){
					map.put(entry2, true);
					pq.add(entry2);
				}
			}

			times++;


		}
		return result;
	}
}
