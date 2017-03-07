package qestion1;
import java.util.Scanner;
public class Bt1 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a");
		double a=kb.nextDouble();
		System.out.println("Enter b");
		double b=kb.nextDouble();
		if(a<0 ||b<0) { System.out.println(" N/A");
		}else { double s=a*b;
		System.out.println("Sum"+s);
	
		}
		}
	}


