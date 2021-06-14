import java.util.*;
public class Reversestr {
	public static void revstr(String S1,String S2)
	{
		String R=S1+S2;
		StringBuffer sb=new StringBuffer(R);
		sb.reverse();
		System.out.println(sb.toString());
		
	}
	
	
	public static void main(String[] args) {
		 
		 revstr("jyoti","sunny");
		 Calendar c = Calendar.getInstance();
	      System.out.println("Current Date and Time :"); 
	      System.out.format("%tB %te, %tY%n", c, c, c);
	      System.out.format("%tl:%tM %tp%n", c, c, c);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String A=s1+s2;
		String Rev="";
		char ch[]=A.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			Rev=Rev+ch[i];
		}
		System.out.println(Rev);
		sc.close();

	}

}
