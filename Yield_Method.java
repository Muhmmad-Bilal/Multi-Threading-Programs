class Item
{
	int value;
	void put(int num)
	{
		value=num;
		System.out.println("Put :"+value);
	}
	int get()
	{
		System.out.println("Get :"+value);
		return value;
	}
}
class Producer extends Thread
{
	Item item;
	Producer(Item item)
	{
		this.item=item;
	}
	public void run()
	{
		int num=0;
		while(true)
		{
		item.put(++num);
		try
		{
			Thread.sleep(500);
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		Thread.yield();
		}
	}
}
class Consumer extends Thread
{
	Item item;
	Consumer(Item item)
	{
		this.item=item;
	}
	public void run()
	{
		
			while(true)
			{
				item.get();
				try
				{
					Thread.sleep(500);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				Thread.yield();
			}
	}
}
class Yield_Method
{
	public static void main(String arg[])
	{
		Item item=new Item();
		Producer t1=new Producer(item);
		Consumer t2=new Consumer(item);
		t1.start();
		t2.start();
	}
}