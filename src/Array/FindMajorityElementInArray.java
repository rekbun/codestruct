package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/12/13
 * Time: 8:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindMajorityElementInArray {
	public int findMajorityElementInArray(int[] src) {
		int majorityElement=src[0];
		int cnt=1;

		for(int i=1;i<src.length;i++) {
			if(src[i]!=majorityElement) {
				cnt--;
			}else {
				cnt++;
			}
			if(cnt==0) {
				majorityElement=src[i];
				cnt=1;
			}
		}

		cnt=0;
		for(int i=0;i<src.length;i++) {
			if(src[i]==majorityElement) {
				cnt++;
			}
		}

		if(cnt>src.length/2) {
			return cnt;
		}
		return -1;
	}
}
