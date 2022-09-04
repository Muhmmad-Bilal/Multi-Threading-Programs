class TestThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=1000;i++)
			{
				System.out.println(getName()+" Thread "+i);
				
				Thread.sleep(500);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(getName()+" Threadinterupted");
		}
		System.out.println("After Thread interupted Code");
		System.out.println(getName()+"Thread End");
	}
}
class Interupt
{
	public static void main(String arg[])
	{
		TestThread t1=new TestThread();
		t1.setName("Demo");
		t1.start();
		System.out.println("main Thread is Waiting");
		try
		{
			Thread.sleep(2000);
			t1.interrupt();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
		System.out.println("Main Thread is waiting");
			try
			{
				Thread.sleep(3000);
				System.out.println("main Thread End");
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
