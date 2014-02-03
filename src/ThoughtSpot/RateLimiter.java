package ThoughtSpot;

import java.util.LinkedList;
import java.util.ListIterator;

/*
	Rate Limiter class provides
		* O(1) allow operation
		* efficient memory allocation and de allocation using re usable circular queue objects
 */
public class RateLimiter {

	// "rate": Maximum per-second rate at which requests can be accepted by Allow().  Assume always >0.
	// "interval": Interval (in seconds) over which the rate is calculated.  Assume always >0.
	public RateLimiter(int rate, int interval) {
		_rate = rate;
		_interval = interval;
		_maxAllowedRequests = rate * interval;
		_currentRequestsCount = 0;
		slidingWindow = new SlidingWindow(interval);
	}

	/*
	    Returns true if a request should be admitted at time "now", false
        otherwise.  If returning true, it is assumed that the request is
        indeed admitted.  Subsequent calls to Allow() are in monotonically
        non-decreasing "now" only.
        runs in O(1) time
	 */
	public synchronized boolean allow(int now) {
		TimeStampRequestCountPair startEntry = slidingWindow.getStartingTimeStampRequestCountPair();

		//slide current interval window if possible
		if (startEntry != null && (now - startEntry.timeStamp >= _interval)) {
			slidingWindow.move();
			_currentRequestsCount -= startEntry.cnt;
		}

		if (_currentRequestsCount < _maxAllowedRequests) {
			slidingWindow.addOrUpdate(now);
			_currentRequestsCount++;
			return true;
		} else {
			return false;
		}

	}

	//private members

	final int _rate;
	final int _interval;
	final int _maxAllowedRequests;

	/*
		  count of currently allowed request
		  might contain outdated value but updated on each allowed request
	 */
	private int _currentRequestsCount;
	private SlidingWindow slidingWindow;


	//private classes
	// private class so no getter or setter
	private static class TimeStampRequestCountPair {
		int timeStamp;
		int cnt;  //count of request for this timestamp

		public TimeStampRequestCountPair(int timeStamp) {
			this.timeStamp = timeStamp;
			cnt = 1;
		}
	}

	/*
		a sliding window implemented as a circular Queue of QNodes
	 */
	private class SlidingWindow {
		private TimeStampRequestCountPair[] Q;
		private final int N; // capacity
		private int f = 0;
		private int r = -1;
		private int size = 0;

		/*
			keeps a circular queue of QNodes of size capacity
		 */
		public SlidingWindow(int capacity) {
			N = capacity;
			Q = new TimeStampRequestCountPair[N];
		}

		public int size() {
			return size;
		}

		public boolean isEmpty() {
			return (size == 0) ? true : false;
		}

		public boolean isFull() {
			if (size == N)
				return true;
			return false;
		}

		/*
			either add a new timestamp or update the last timestamp
		 */
		public void addOrUpdate(int timeStamp) {
			if (!isEmpty() && Q[r].timeStamp == timeStamp) {
				Q[r].cnt++;
			} else {
				r = (r + 1) % N;
				size++;

				if (Q[r] == null) {
					//only one time allocation untill capacity is reached
					Q[r] = new TimeStampRequestCountPair(timeStamp);
				} else {
					//re use the old referenced TimeStampRequestCountPair
					Q[r].cnt = 1;
					Q[r].timeStamp = timeStamp;
				}
			}
		}

		/*
			move the window to ignore outdated timestamp
		 */
		public TimeStampRequestCountPair move() {
			if (!isEmpty()) {
				TimeStampRequestCountPair item;
				item = Q[f];
				//Q[f] = null;
				f = (f + 1) % N;
				size--;
				if (size == 0) {
					f = 0;
					r = -1;
				}
				return item;
			}
			return null;
		}

		public TimeStampRequestCountPair getStartingTimeStampRequestCountPair() {
			return Q[f];
		}
	}
}
