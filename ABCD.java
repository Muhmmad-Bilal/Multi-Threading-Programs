class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("A Thread:"+i);
		}
		System.out.println("A Thread End");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("B Thread:"+i);
		}
		System.out.println("B Thread End");
	}
}
class C extends Thread
{
	public void run()
	{
	for(int i=0;i<=15;i++)
	{
		try
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("C Thread:"+i);
	}
	System.out.println("C Thread End:");
	}
}

class D extends Thread
{
	public void run()
	{
		for(int i=0;i<=20;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("D Thread:"+i);
		}
		System.out.println("D Thread End");
	}
}
class ABCD
{
	public static void main(String arg[])
	{
		A t1=new A();
		B t2=new B();
		C t3=new C();
		D t4=new D();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		for(int i=0;i<=25;i++)
		{
			try
			{
				Thread.sleep(2500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Main Thread:"+i);
		}
		System.out.println("Main Thread End");
	}
}