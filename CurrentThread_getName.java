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
				Thread.sleep(time);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name+" Thread "+i);
		}
		System.out.println("Thread End");
	}
	
}
class CurrentThread_getName
{
	public static void main(String arg[])
	{
		Demo t1=new Demo(500,5,"A");
		Demo t2=new Demo(1000,10,"B");
		Demo t3=new Demo(1500,15,"C");
		t1.start();
		t2.start();
		t3.start();
		Thread t=Thread.currentThread();
		String name=t.getName();
		for(int i=1;i<=20;i++)
		{
			try
			{
					Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(name+" Thread "+i);
		}
		System.out.println("Main Thread End");
	}
}