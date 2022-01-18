/* 거스름돈 */

package greedy;

import java.util.Scanner;

public class GreedyPractice1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] coin = { 500, 100, 50, 10 };
		int n = scan.nextInt();
		int ans = 0;
		
		for(int i = 0; i < coin.length; i++) {
			ans += n / coin[i];
			n = n % coin[i];
		}

		System.out.println(ans);
	}
}
