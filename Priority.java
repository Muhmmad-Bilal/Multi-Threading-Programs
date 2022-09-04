class Demo extends Thread
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
		Demo t1=new Demo();
		Demo t2=new Demo();
		Demo t3=new Demo();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main Thread is Waiting two second");
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
		System.out.println(t1.getName()+" Thread "+t1.counter);
		System.out.println(t2.getName()+" Thread "+t2.counter);
		System.out.println(t3.getName()+" Thread "+t3.counter);
		
	}
}






