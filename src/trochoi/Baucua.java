package trochoi;
import java .util.*; // cabh viet cho ham ramdon;

public class Baucua {
	public static void main(String a[])
	{
		Random rd=new Random();
		int so=rd.nextInt(6);
		System.out.println(goiTen(so));
		int so1=rd.nextInt(6);
		if(so1 != so )so1=rd.nextInt(6);
		System.out.println(goiTen(so1));
		int so2=rd.nextInt(6);
		System.out.println(goiTen(so2));
		
	}
	public static String goiTen(int x){
		switch(x){
			case 0: return "nai";
			case 1: return "bau ";
			case 2: return "ga";
			case 3: return "ca";
			case 4: return "tom ";
			default: return "cua";
			
		}
	}

}
