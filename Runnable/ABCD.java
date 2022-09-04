class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("A Thread:"+i);
		}
		System.out.println("A Thread End");
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
					Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("B Thread:"+i);
		}
		System.out.println("B Thread End");
	}
}

class C implements Runnable
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			try
			{
				Thread.sleep(1500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("C Thread:"+i);
		}
		System.out.println("C Thread End");
	}
}
class D implements Runnable
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
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
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		Thread t4=new Thread(d);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=1;i<=25;i++)
		{
			try
			{
				Thread.sleep(2500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Main Thread:"+i);
		}
		System.out.println("Main End");
	}
}












