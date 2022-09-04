class Item
{
	int value;
synchronized void put(int num)
	{
		value=num;
		System.out.println("Put "+value);
	}
	synchronized int get()
	{
		System.out.println("Get "+value);
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
			Thread.yield();
		}
	}
}
class Producer_Consumer
{
	public static void main(String arg[])
	{
		Item item=new Item();
		Producer p=new Producer(item);
		Consumer c=new Consumer(item);
		p.start();
		c.start();
	}
}
