package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/12/13
 * Time: 11:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindLeaders {
	public void findLeaders(int[] src) {
		int max=src[src.length-1];
		System.out.println(max);
		for(int i=src.length-2;i>=0;i--) {
			if(src[i]>max) {
				System.out.println(src[i]);
				max=src[i];
			}
		}
	}
}
