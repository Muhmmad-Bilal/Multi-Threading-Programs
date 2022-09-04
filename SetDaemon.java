class Demo extends Thread
{
	int time;
	int loop;
	String name;
	Demo(int time,int loop,String name)
	{
		this.time=time;
		this.loop=loop;
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<=loop;i++)
		{
			try
			{
				System.out.println(name+" Thread "+i);
				Thread.sleep(time);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
			System.out.println(name+"Thread End");
	}
}
class SetDaemon
{
	public static void main(String arg[])
	{
		Demo t1=new Demo(500,10,"A");
		Demo t2=new Demo(1000,15,"B");
		Demo t3=new Demo(1500,20,"C");
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(" Main Thread Waiting 2 Second");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Main Thread End");
	}
}