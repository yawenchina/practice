public static int cutting(int m){
	int result = 0;
	for(int i = 1; i < m; i++){
		result =Math.max(Math.max(i*cutting(m-i),i*(m-i)),result);
	}
	return result;
}