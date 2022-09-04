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
			item.put(num++);
		
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
				item.get();
	}	
}
class Item_Produser_Consumer
{
	public static void main(String arg[])
	{
		Item item =new Item();
		Producer t1=new Producer(item);
		Consumer t2=new Consumer(item);
		t1.start();
		t2.start();
	}
}


















