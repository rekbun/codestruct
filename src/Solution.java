import Array.FindMinInRotatedArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
	static Map<Long,Long> map=new HashMap<Long, Long>();
	public static void main(String[] args) {
		int T;


		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String input;

		try {
			input = br.readLine();
			T = Integer.parseInt(input);

			while (T-- > 0) {
				int N;
				input = br.readLine();
				String[] inputStrings = input.split(" ");
				N = Integer.parseInt(inputStrings[0]);
				int [] array=new int[N];
				for(int i=0;i<N;i++) {
					input=br.readLine();
					array[i]=Integer.parseInt(input);
				}

				FindMinInRotatedArray sol=new FindMinInRotatedArray();
				System.out.println(sol.findMin(array));

			}
		} catch (Exception e) {

		}
	}

	private static void f(Long n,int cnt) {
		if(cnt>13) {
			return;
		}
		Long val=1L;
		while (val<=500L) {
			if(n%val==0) {
				if(!map.containsKey(val)|| map.get(val)>n) {
					map.put(val,n);
				}
			}
			val++;
		}
		if(n<=500) {
			map.put(n,n);
		}
		f(n*10,cnt+1);
		f(n*10+9,cnt+1);
	}

}
