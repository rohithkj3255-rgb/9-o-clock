package qedge.feb22;

public class Sample {

	public static void add(int x,int y) {
		
		int z=x+y;
		System.out.println(z);
		
	}
	
	public static String verify_String(String str1,String str2)
	
	{
		
		String res="";
		if(str1.equalsIgnoreCase(str2))
		{
			res="Strings are equal";
			
		}
		else
		{
			res="Strings are not equal";
		}
		return res;
	}
	
	public static boolean CompareValues(int a,int b)
	{
		if(a==b)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
		
		public static void main(String[]args)
		{
		Sample.add(24, 25);
		
		String Verify =Sample.verify_String("Hello"," India");
		System.out.println(Verify);
		
		boolean comp=Sample.CompareValues(56, 56);
		System.out.println(comp);
		}
		
		// TODO Auto-generated method stub
		
		

	}


