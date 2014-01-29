import Array.FindMinInRotatedArray;
import Array.MaxElementInaArray;
import DP.CoinChange;
import DP.MatrixChainMultiplication;
import strings.KMP;

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
	public static void main(String[] args) {
		MatrixChainMultiplication sol= new MatrixChainMultiplication();
		System.out.println(sol.matrixChainMultiplication(new int[]{40, 20, 30, 10, 30}));
	}
}
