class Demo implements Runnable
{
	int time;
	int loop;
	String name;
	Demo(String name,int loop,int time)
	{
		this.name=name;
		this.loop=loop;
		this.time=time;
	}
	public void run()
	{
		for(int i=1;i<=loop;i++)
		{
			try
			{
				Thread.sleep(time);
			}
			catch(Exception e)
			{
			System.out.println(e);	
			}
			System.out.println(name+"Thread"+i);
		}
		System.out.println("Thread End");
	}
}
class CurrentThread
{
	public static void main(String arg[])
	{
		Demo d1=new Demo("Bilal",10,500);
		Demo d2=new Demo("ALi",15,1000);
		Demo d3=new Demo("Janwari",20,1500);
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		t1.start();
		t2.start();
		t3.start();
		Thread t=Thread.currentThread();
		String name=t.getName();
		for(int i=1;i<20;i++)
		{
			try
			{
			System.out.println(name+" Thread "+i);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		System.out.println("Main Thead End");
		
	}
}




