public static void main(String args[]){
	String m = "asdfghm";
	char[] array = m.toCharArray();
	copy(array, 0)




}
public static copy (char[] array, int index){
	for(int i = index; i < array.length; i++) {
		
			swap(m, i, index);
			copy(array, index+1);
			swap(m, i, index);
		
	}



}
public static void swap (char[] m ,int i, int j) {
	if (i == j){
		return ;
	}
	char temp = char[i];
	char[i] = char[j];
	char[j] = temp; 

}