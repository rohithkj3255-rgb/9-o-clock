package qedge.feb22;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int x=456;
			int y=0;
			int z =x/y;
			System.out.println(z);
			
		} catch (Throwable e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	
		
		//Second block
		
		int a=60;
		int b=20;
		int c=a/b;
		System.out.println(c);

	}

}
