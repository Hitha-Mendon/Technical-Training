//equation x=(loga+log10(b)+e^a)/(a^b+3√b+tana)     


import java.util.Scanner;
public class equation2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a:");
	    int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		double x=(Math.log(a)+Math.log10(b)+Math.exp(a))/(Math.pow(a,b)+Math.cbrt(b)+Math.tan(a));
		System.out.println("the result is:"+x);
	}
}