class Foo
{
	synchronized void first(Boo b)
	
	{
		try
		{
		Thread.sleep(100);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		b.last();
	}
	synchronized void last()
	{
		System.out.println("Last Method of Foo");
	}
	static
	{
		System.out.println("Last of foo");
	}
}
class Boo
{
	synchronized void first(Foo f) 
	{
		try
		{
		Thread.sleep(100);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		f.last();
	}
		synchronized void last()
		{
			System.out.println("Last Method  Boo");
		}
static{
	System.out.println("Last of boo");
}
}
class Producer extends Thread
{
	Foo f;
	Boo b;
	Producer(Foo f,Boo b)
	{
	this.f=f;
	this.b=b;
	}
	public void run()
	{
		
		f.first(b);
	}
}
class Consumer extends Thread
{
	Foo f;
	Boo b;
	Consumer(Foo f,Boo b)
	{
		this.f=f;
		this.b=b;
		
	}
	public void run()
	{
		b.first(f);
	}
}
class DeadLock
{
	public static void main(String arg[])
	{
		Foo f=new Foo();
		Boo b=new Boo();
		Producer p=new Producer(f,b);
		Consumer c=new Consumer(f,b);
		p.start();
		c.start();
	}
}