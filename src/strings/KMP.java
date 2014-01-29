package strings;

public class KMP {
	public int search(String src,String pat) {
		int[] pt=new int[pat.length()];
		setPrefixTable(pat, pt);

		int i=0;
		int j=0;
		while (i+j<src.length()) {
			if(src.charAt(i+j)==pat.charAt(j)) {
				j++;
				if(j==pat.length()) {
					return i;
				}
			}else if(j>0){
				i=i+j-pt[j-1];
				j=pt[j-1];
			}else {
				i=i+1;
				j=0;
			}
		}
		return -1;
	}

	private void setPrefixTable(String pat,int[] pt) {
		int i=0;
		int j=1;
		pt[0]=0;
		pt[1]=0;
		while (j<pat.length()) {
			if(pat.charAt(i)==pat.charAt(j)) {
				i++;
				pt[j]=i;
				j++;
			}else if(pt[i]>0) {
				i=pt[i]-1;
			}else {
				i=0;
				pt[j]=0;
				j++;
			}
		}
	}
}
