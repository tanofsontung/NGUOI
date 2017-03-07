package qestion1;
import java.util.Scanner;
public class Bt6 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter b");
		double b=kb.nextDouble();
		System.out.println("Enter c");
		double c=kb.nextDouble();
		if( b==0) {
			if(c==0) System.out.println("ptvsn");
		else System.out.println("ptvn");
	
		}
			else  System.out.println("ptcn ="+(-c/b));
		
			
	}

}
