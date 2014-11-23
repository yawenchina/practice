
public class hitGame {
	public static void main (String args[]) {
		String m = "RGBRYY";
		String n = "GGRBRR";
		check(m, n);

	}
	public static void check(String m, String n) {
		// n is the guess!!
		int hit = 0;
		if(m.length() != n.length()){
			return ;
		}
		int[] fre = new int[4];

		for (int i = 0; i < m.length(); i++) {
			if(m.charAt(i) == n.charAt(i)){
				hit++;
				System.out.println(hit);
			}else{
				int index = findIndex(m.charAt(i));
				fre[index]++;
			}
		}

		int peo = 0;
		for (int j = 0; j < n.length(); j++) {
				if(m.charAt(j) != n.charAt(j)){
					int code = findIndex(n.charAt(j));
					//System.out.print("the code is"+code);
					if(code >= 0 && fre[code] > 0){
						peo++;
						fre[code]--;
						System.out.print(fre[code]);
					}


				}

		}
		System.out.print(peo);


	}
	public static int findIndex (char t) {
		
		switch(t){
			case 'B':
				return 0;
			case 'G':
				return 1;
			case 'R':
				return 2;
			case 'Y':
				return 3;
			default:
				return -1;
		}



	}
}
