class Calc 
{
	int value;
	Calc(int value)
	{
		this.value=value;
	}
	synchronized void increment()
	{
		Thread t=Thread.currentThread();
		value+=500;
		String name=t.getName();
		System.out.println("Increment "+value+" By "+name+ "Thread");
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Increment :"+value +" By "+name+"Thread" );
		value+=1500;
		try
		{
			Thread.sleep(1500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		value+=1000;
		//Thread.sleep(1500);
		try
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Increment :"+value+" By "+name+" Thread " );
		

	}
	synchronized void decrement()
	{
		Thread t=Thread.currentThread();
		value-=500;
		String name=t.getName();
	System.out.println("Decrement "+value+" By "+name+ "Thread");
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Decrement :"+value +" By "+name+"Thread" );
		value-=1500;
		try
		{
			Thread.sleep(1500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		value-=1000;
		//Thread.sleep(1500);
		try
		{
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Decrement :"+value+" By "+name+" Thread " );
		
	}
}

class Producer extends Thread
{
	Calc ob;
	Producer(Calc ob)
	{
		this.ob=ob;
	}
	public void run()
	{
			ob.increment();
	}
}
class Consumer extends Thread
{
	Calc ob;
	Consumer(Calc ob)
	{
		this.ob=ob;
		
	}
	public void run()
	{
		ob.decrement();
	}
}
class Increment_Decrement
{
	public static void main(String arg[])
	{
		Calc c=new Calc(5000);
		Producer p=new Producer(c);
		Consumer con=new Consumer(c);
		p.setName("Producer");
		con.setName("Consumer");
		p.start();
		con.start();
		
	}
}






