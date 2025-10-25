package qedge.feb22;

public class Child extends Parent{
	
	public static void add(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
		
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Child.add(20, 30);
		Parent.launchURL("http://orangehrm.qedgetech.com/");
		Parent.adminlogin("Admin","Qedge123!@#");
		Thread.sleep(2000);
		Parent.quit();
		
		

	}

}
