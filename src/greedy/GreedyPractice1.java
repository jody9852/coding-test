package greedy;

import java.util.Scanner;

public class GreedyPractice1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] coin = { 500, 100, 50, 10 };
		int n = scan.nextInt();
		int ans = 0;
		int i = 0;
		
		while(i != coin.length) {
			ans += n / coin[i];
			n = n % coin[i];
			i++;
		}
		
		System.out.println(ans);
	}
}
