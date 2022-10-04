package baekjoon;

import java.util.Scanner;

public class baekjoonif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner score = new Scanner(System.in);
			int a=score.nextInt();
			
			if(a>=90) {
				System.out.println('A');
			}
			 else if(a>=80) {
				System.out.println('B');
			}
			 else if( a>=70) {
				System.out.println('C');
			}
			 else if(a>=60) {
				System.out.println('D');
			}
			 else {
				System.out.println('F');
			}	
			
	}

}
