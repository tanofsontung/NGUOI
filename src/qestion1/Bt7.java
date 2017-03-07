package qestion1;
import java.util.Scanner;
import java.util.Scanner;

public class Bt7 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a");
		double a=kb.nextDouble();
		System.out.println("Enter b");
		double b=kb.nextDouble();
		System.out.println("Enter c");
		double c=kb.nextDouble();
		if(a==0){ System.out.println("Giai Phuong Trinh Bac 1");
	}
		else{ double delta=b*b-4*a*c;
		double x1,x2;
		x1=((-b+Math.sqrt(delta))/(2*a));
		x2=((-b-Math.sqrt(delta))/(2*a));
		if(delta <0){ System.out.println("ptvn");}
		if(delta>0){ System.out.println("pt co nghiem x1 ="+x1);
		System.out.println("pt co nghiem x2 ="+x2);
		}
		if(delta==0) System.out.println("co nghiem kep x1=x2"+(-b/(2*a)));
		
		
		}
		}

}
