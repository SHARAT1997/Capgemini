package inheritance;

 class demo1 {
		demo1()
		{
			System.out.println("From class Demo1");
		}
		{
			System.out.println("From class Demo1 IIB-1");
		}
		demo1(int i)
		{
			this();
			System.out.println("From class Demo1 (int i)");	
	}

}
class demo2 extends demo1{
	{
		System.out.println("NSI executed");
	}
		demo2()
		{
			super(10);
			System.out.println("From class Demo2");	
			
		}
		{
			System.out.println("From class Demo2 IIB-1");
			
		}
		demo2(int i)
		{
			System.out.println("From class Demo2 (int i)");	
			
		}
		{
			System.out.println("Qspiders");		
		}	
}


