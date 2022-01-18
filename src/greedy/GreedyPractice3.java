// 숫자 카드 게임 

package greedy;

import java.util.Scanner;

public class GreedyPractice3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int rslt = -1;
		int min = 9999999;
		int num = 0;
		
		for(int i = 0; i < n; i++) {
			min = 9999999;
			for(int j = 0; j < m; j++) {
				num = scan.nextInt();
				
				if(num < min) min = num;
			}
			if(min > rslt) rslt = min;
		}
		
		System.out.println(rslt);
	}
}
