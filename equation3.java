
//find a^b if a<b else find b^a    


import java.util.Scanner;
public class equation3
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a:");
	    int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		double x=Math.pow(Math.min(a,b),Math.max(a,b));
		System.out.println("the result is:"+x);
	}
}