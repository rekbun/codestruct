import Integral.Test1;
import ThoughtSpot.RateLimiter;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String args[] ) throws Exception {
		int testRate = 3;
		int testInterval = 5;
		int[] testEventStream = {1,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,15,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,17,18,19,20,21,22,23,24,25,26};

		RateLimiter testRateLimiter = new RateLimiter(testRate, testInterval);

		for (int eventTime : testEventStream)
		{
			boolean allow = testRateLimiter.allow(eventTime);
			if (allow)
			{
				System.out.println(eventTime + " ALLOWED");
			}
			else
			{
				System.out.println(eventTime + " DISALLOWED");
			}
		}

	}
}