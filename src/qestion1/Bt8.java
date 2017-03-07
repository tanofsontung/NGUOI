package qestion1;

import java.util.Scanner;

public class Bt8 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n");
		int n=kb.nextInt();
		if(n>=1&&n<=4) System.out.println("Quy 1");
		if(n>=5&&n<=8) System.out.println("Quy 2");
		if(n>=9&&n<=12) System.out.println("Quy 3");
	}

}
