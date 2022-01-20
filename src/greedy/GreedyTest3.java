// 문자열 뒤집기

package greedy;

import java.util.Scanner;

public class GreedyTest3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] strSplit = str.split("");
		int cnt0 = 0, cnt1 = 0;
		
		if(strSplit[0].equals("1")) cnt0++;
		else cnt1++;
		
		for(int i = 0; i < strSplit.length - 1; i++) {
			
			System.out.println(cnt0 + " " + cnt1);
			if(!strSplit[i].equals(strSplit[i + 1])) {
				if(strSplit[i + 1].equals("1")) cnt0++;
				else cnt1++;
			}
		}
		if(cnt0 < cnt1) System.out.println(cnt0);
		else System.out.println(cnt1);
	}
}
