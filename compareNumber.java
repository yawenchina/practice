public static void main(String args[]){
	int[] array = {2,8,4,1,7,9,3,5,10,0};
	HashMap<Integer,TreeSet<Integer>> map = new HashMap<Integer, TreeSet<Integer>>();
	//store all of them on the hashMap:
	for(int i = 0; i < array.length-2; i+=2){
		if(a[i] < a[i+1]){
			if(map.containsKey(a[i+1])){
				map.get(a[i+1]).add(a[i]);
			}else{
				TreeSet<Integer> set = new TreeSet<Integer>();
				set.add(a[i]);
				map.put(a[i+1],a[i]);
			}
		}else{
			if(map.containsKey(a[i])){
				map.get(a[i+1]).add(a[i+1]);
			}else{
				TreeSet<Integer> set = new TreeSet<Integer>();
				set.add(a[i+1]);
				map.put(a[i],a[i+1]);
			}
		}

	}



}