class Demo extends Thread
{
	int time;
	int loop;
	String name;
	Demo(String name,int time,int loop)
	{
		super(name);
		this.name=name;
		this.time=time;
		this.loop=loop;
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
class isAlive_Join
{
	public static void main(String arg[])
	{
		Demo t1=new Demo("A",500,10);
		Demo t2=new Demo("B",1000,15);
		Demo t3=new Demo("C",1500,20);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(t1.getName()+"Thread"+t1.isAlive());
		System.out.println(t2.getName()+" Thread "+t2.isAlive());
		System.out.println(t3.getName()+" Thread "+t3.isAlive());
		try
		{
		t1.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(t1.getName()+" Thread "+t1.isAlive());
		System.out.println(t2.getName()+" Thread "+t2.isAlive());
		System.out.println(t3.getName()+" Thread "+t3.isAlive());
		try
		{
		t2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(t1.getName()+" Thread "+t1.isAlive());
		System.out.println(t2.getName()+" Thread "+t2.isAlive());
		System.out.println(t3.getName()+" Thread "+t3.isAlive());
		try
		{
		t3.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(t1.getName()+" Thread "+t1.isAlive());
		System.out.println(t2.getName()+" Thread "+t2.isAlive());
		System.out.println(t3.getName()+" Thread "+t3.isAlive());
		System.out.println("Main Thread End");
	}
}









