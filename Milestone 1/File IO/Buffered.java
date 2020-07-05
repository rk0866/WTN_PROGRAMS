package FileIO;
//import java.util.*;
import java.io.*;
public class Buffered {
public static void main(String[] args)
{
	//Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try {
	 String s=br.readLine();
	 System.out.println(s);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
