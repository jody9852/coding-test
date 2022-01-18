// 1이 될 때까지

package greedy;

import java.util.Scanner;

public class GreedyPractice4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int rslt = 0;
		int tmp = 1;
		
		while(tmp < n) {
			rslt++;
			tmp *= k;
		}
		
		
		if(tmp != n) {
			rslt--;
			
			tmp /= k;
			rslt += n - tmp;
		}
		
		System.out.println(rslt);
	}
}
