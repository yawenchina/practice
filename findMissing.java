
public class findMisssingOne {
	
		public static void main(String args[]){
			int[] m = {1,2,3,5};
			int[] mm = {2,3,4,5};
			int[] mmm = {1,2,3,4};
			System.out.println(find(m));
			System.out.println(find(mm));
			System.out.println(find(mmm));
		}
		public static int find(int[] m){
			for(int i = 0; i< m.length;i++){
				int index = m[i]-1;
				while(index >=0 && index < m.length && m[index] !=-1){
					index = m[index]-1;
					m[index]= -1;
				}
			}
			for(int i = 0; i< m.length;i++){
				if(m[i] != -1){
					return i+1;
				}
			}
			return m.length+1;
		}

}
