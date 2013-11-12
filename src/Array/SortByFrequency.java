package Array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/12/13
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class SortByFrequency {
	public void sortByFrequency(int[] src) {
		Arrays.sort(src);
		int[][] freqArray=new int[src.length][2];
		freqArray[0][0]=src[0];
		freqArray[0][1]=1;
		int sizeOfFreq=0;
		for(int i=1;i<src.length;i++) {
			if(src[i]==src[i-1]) {
				freqArray[sizeOfFreq][1]++;
			}else {
				freqArray[++sizeOfFreq][0]=src[i];
				freqArray[sizeOfFreq][1]=1;
			}
		}

		sort(freqArray,0,sizeOfFreq);
		sizeOfFreq=0;
		for(int i=0;i<src.length;) {
			while (freqArray[sizeOfFreq][1]-->0) {
				src[i]=freqArray[sizeOfFreq][0];
				i++;
			}
			sizeOfFreq++;
		}
	}

	private void sort(int[][] freqArray, int s, int e) {
		if(s>e) {
			return;
		}

		int pivot=findPivot(freqArray,s,e);
		if(pivot==s-1) {
			return;
		}
		sort(freqArray, s, pivot-1);
		sort(freqArray, pivot+1, e);
	}

	private int findPivot(int[][] freqArray, int s, int e) {

		int sm=s-1;

		for(int i=s;i<e;i++) {
			if(freqArray[i][1]>freqArray[e][1]) {
				swap(freqArray,i,++sm);
			}
		}
		swap(freqArray,++sm,e);
		return sm;
	}

	private void swap(int[][] freqArray, int s, int e) {
		int[] el=freqArray[s];
		freqArray[s]=freqArray[e];
		freqArray[e]=el;
	}
}
