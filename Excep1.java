package p1;
import java.io.*;
import java.util.*;


public class Excep1 {
	static int l,b;
	static boolean flag=true;
	static {
		System.out.println("Enter length and breadth of Rectangle");
		Scanner a=new Scanner(System.in);
		l=a.nextInt();
		b=a.nextInt();
		if(l<=0 ||b<=0) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		a=l*b;
		System.out.println("Area of Rectangle "+a);
		

	}

}
