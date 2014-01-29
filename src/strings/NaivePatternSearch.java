package strings;

public class NaivePatternSearch {
	public int search(String src,String pat) {

		for(int i=0;i<=src.length()-pat.length();i++) {
			int j;
			for (j=0;j<pat.length();i++) {
				if(src.charAt(i+j)==pat.charAt(j)) {
					continue;
				}else {
					break;
				}
			}
			if(j==pat.length()) {
				return i;
			}
		}
		return -1;
	}
}
