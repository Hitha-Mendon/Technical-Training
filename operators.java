//using operators instead og if else condition
//find min number


import java.util.Scanner;
public class operators
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a:");
	    int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		int x=(a<b)?a:b;
		System.out.println("the minimum is:"+x);
	}
}