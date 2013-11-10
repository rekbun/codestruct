package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class MajorityElement {
	public int majorityElement(int[] src) {
		int max=src[0];
		int cnt=1;
		for(int i=1;i<src.length;i++) {
			if(src[i]==max) {
				cnt++;
			}else {
				cnt--;
			}
			if(cnt==0) {
				max=src[i];
				cnt++;
			}
		}

		cnt=0;
		for(int i=0;i<src.length;i++) {
			if(src[i]==max) {
				cnt++;
			}
		}
		if(cnt>src.length/2) {
			return max;
		}else {
			return -1;
		}

	}
}
