package StringBuffer;
import java.util.*;
	public class Strcopies {
	public static void main(String[] args)
	{
		Scanner  sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		for(int i=0;i<s.length();i++)
		{
			res+=s.charAt(0);
			res+=s.charAt(1);
			
		}
		System.out.println(res);
	}
}
