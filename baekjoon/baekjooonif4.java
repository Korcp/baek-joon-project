package baekjoon;

import java.util.Scanner;

public class baekjooonif4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner quat= new Scanner(System.in);
		
		int x=quat.nextInt();
		int y=quat.nextInt();
		
		if(x>0&&y>0) {
			System.out.println(1);
		}
		if(x<0&&y>0) {
			System.out.println(2);
		}
		if(x<0&&y<0) {
			System.out.println(3);
		}
		if(x>0&&y<0) {
			System.out.println(4);
		}
	}

}
