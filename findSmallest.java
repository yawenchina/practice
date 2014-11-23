public static int[] findSmallest (int[] array) {
	int[] output = new int[2];
	if (array == null || array.length < 2) {
		return array;
}
output[0] = array[0] < array[1] ? array[0] : array[1];
output[1] = array[0] < array[1] ? array[1] : array[0];
for (int i = 2; i < array.length; i++) {
	if (array[i] < output[1]){
		if (array[i] <= output[0]) {
			output[1] = output[0];
output[0] = array[i]; 
} else {
	output[1] = array[i];
}
}
}
	return output;
}
