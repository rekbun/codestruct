/*
http://www.geeksforgeeks.org/count-pairs-difference-equal-k/

Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.

Examples:

Input: arr[] = {1, 5, 3, 4, 2}, k = 3
Output: 2
There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}

Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
Output: 5
There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8},
{8, 12}, {12, 16} and {16, 20}

 */

package Array;

import java.util.Arrays;

public class CountPairWithDiffK {
	public int countPairWithDiffK(int[] src, int k) {
		if (src == null || src.length == 0) {
			return 0;
		}

		Arrays.sort(src);
		int i = 0;
		int j = 0;

		int cnt = 0;
		int lastCount = 0;
		while (i < src.length) {
			if (i > 0 && src[i] == src[i - 1]) {
				cnt += lastCount;
				continue;
			}else{
				lastCount=0;
			}


			while (j < src.length) {
				if (src[j] - src[i] == k) {
					cnt++;
					lastCount++;
				} else if (src[j] - src[i] > k) {

					j--;
					break;

				}
				j++;
			}
			i++;
		}
		return cnt;

	}
}
