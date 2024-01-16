
//equation x=√ a^b-sin(b^a)      


import java.util.Scanner;
public class equation1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a:");
	    int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		double x=Math.sqrt(Math.pow(a,b)-Math.sin(Math.pow(b,a)));
		System.out.println("the result is:"+x);
	}
}