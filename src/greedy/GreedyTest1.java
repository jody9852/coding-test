// 모험가 길드

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyTest1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int rslt = 0;
		
		for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
		
		Arrays.sort(arr);
		
		int i = 0;
		
		while(i < arr.length) {
			i += arr[i];
			
			if(i >= arr.length) {
				break;
			}
			else {
				rslt++;
			}
		}
		
		System.out.println(rslt);
	}
}
