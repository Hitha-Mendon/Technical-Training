
//if a numberis less than 21 then,subtract that num by 21 else multiply the result obtained by the subraction of given num and 21 by 2


import java.util.Scanner;
public class static1
{
    static int diff21(int n){
        int x;
        x=(n<21)?(Math.abs(n-21)):2*(Math.abs(n-21));
        return x;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of n:");
	    int n=sc.nextInt();
		int x=diff21(n);
		System.out.println("the result is:"+x);
	}
}