// 곱하기 혹은 더하기

package greedy;

import java.util.Scanner;

public class GreedyTest2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] str = s.split("");
		int num = 0;
		int rslt = 1;
		
		for(int i = 0; i < str.length; i++) {
			num = Integer.valueOf(str[i]);
			if(num > 1 || rslt > 1) {
				rslt *= num;
			}
			else {
				rslt += num;
			}
		}
		System.out.println();
	}
}
