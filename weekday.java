/*The parameter weekday is true if it is a weekday and the 
parameter vacation is true if we are on vacation.We sleep in if it is not
a weekday or we are on a vacation.Return true if we sleep in*/

import java.util.Scanner;
public class weekday
{
    static boolean sleep(boolean w,boolean v){
        
        return(!w||v);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of w:");
	    boolean w=sc.nextBoolean();
	    System.out.println("enter the value of v:");
	    boolean v=sc.nextBoolean();
		boolean x=sleep(w,v);
		System.out.println("the result is:"+x);
	}
}
