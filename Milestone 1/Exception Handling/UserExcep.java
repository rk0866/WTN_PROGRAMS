package ExceptionHandling;
import java.util.*;
class InvalidCountryException extends Exception
{
	InvalidCountryException(String s) {
		super(s);
	}
}

public class UserExcep {
	static void validate(String b) {
	if(b.equals("india"))
		System.out.println("User registered");
	else {
		try {
			throw new InvalidCountryException("Invalid Country Exception");
		} catch (InvalidCountryException e) {
			System.out.println(e);
		}
	}
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		try {
		validate(b);
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e);
		}
	}
}
