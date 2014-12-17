
public class joinstring {
	public static void main(String args[]){
		String[] m = {"abc","bcd","cde"};
		joinstring join = new joinstring();
		
		System.out.print(join.joinWords(m));
	}
	public  String joinWords(String[] words){
		String[] res = new String[1];
		res[0] = " ";
		boolean[] checked = new boolean[words.length]; 
		joinWordsHelper(words, " ", res, 0,checked);
		return res[0];
	}
	public  void joinWordsHelper(String[] words, String bu, String[] res,int index,boolean[] checked){
		if(index == words.length){
			if(res[0].equals(" ")|| bu.length() < res[0].length()){
				res[0] = new String(bu);
			}
			return ;
		}
		for(int i = 0; i < words.length; i++){
			if(!checked[i]){
				checked[i] = true;
				if(bu.indexOf(words[i]) > -1){
					joinWordsHelper(words,bu,res,index+1,checked);
				
				}else{
					int len = bu.length();
					int lcur = words[i].length();
						for(int j = 0; j < len; j++){
							String cur = bu.toString().substring(j);
							if(lcur< cur.length()){
								continue;
							}
							String org = words[i].substring(0,cur.length());
							if(cur.equals(org)){
								joinWordsHelper(words,bu + words[i].substring(cur.length()),res,index+1,checked);
							}
						}
					
						joinWordsHelper(words,bu+words[i],res,index+1,checked);
				
				}
				checked[i] = false;
			}
		}
	}
}
