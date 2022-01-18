// 큰 수의 법칙 

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyPractice2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		int rslt = 0;
		
		for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		int first = arr[arr.length - 1];
		int second = arr[arr.length - 2];
		
		rslt = (first * k + second) * (m / (k + 1));
		
		if(m % (k + 1) != 0) rslt += (m % (k + 1)) * first;
		
		System.out.println(rslt);
	}
}
