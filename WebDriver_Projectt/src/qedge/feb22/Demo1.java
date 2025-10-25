package qedge.feb22;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 ="Selenium";
		String str2="Manual";
		String str3 -"Auromatiom"
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Strings are equal");
			
		}
		else
		{
			try {
				throw new Error("Strings are not equal");
				
			} catch (Throwable e) {
				// TODO: handle exception
				System.out.println(e.getLocalizedMessage());
			}
			
		}


	}

}
