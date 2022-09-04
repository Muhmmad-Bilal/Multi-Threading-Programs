class Demo implements Runnable
{
	int counter=0;
	public void run()
	{
		while(true)
		{
			counter++;
		}
	}
}
class Priority
{
	public static void main(String arg[])
	{
		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main thread Wait 2 Second");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t1.stop();
		t2.stop();
		t3.stop();
		System.out.println(t1.getName()+" Thread "+d1.counter);
		System.out.println(t2.getName()+" Thread "+d2.counter);
		System.out.println(t3.getName()+" Thread "+d3.counter);
	}
}






