import java.awt.*;
import java.awt.event.*;
class Simple_Game implements ActionListener,Runnable
{
	Button b1=new Button("start");
	Button b2=new Button("stop");
	Button b3=new Button("Suspend");
	Button b4=new Button("Resume");
	Button b5=new Button("DemoThread");
	Frame win=new Frame();
	//Simple_Game s=new Simple_Game();
	Thread t;
	Simple_Game()
	{
		win.setBackground(Color.BLUE);
		t=new Thread(this);
		win.setBounds(0,0,600,600);
		win.setLayout(null);
		b1.setBounds(70,500,50,25);
		b2.setBounds(170,500,50,25);
		b3.setBounds(270,500,50,25);
		b4.setBounds(370,500,50,25);
		b5.setBounds(50,220,100,25);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		win.add(b1);
		win.add(b2);
		win.add(b3);
		win.add(b4);
		win.add(b5);
		win.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			t.start();
		if(e.getSource()==b2)
			t.stop();
		if(e.getSource()==b3)
			t.suspend();
		if(e.getSource()==b4)
			t.resume();
	}
	public void run()
	{
		do{
		for(int i=1;i<=450;i+=10)
		{
//			b5.setBounds(i,210,100,25);
			b5.setLocation(i,100);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		for(int i=450;i>=1;i-=10)
		{
			//b5.setBounds(i,210,100,25);
			b5.setLocation(i,100);
			
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		}while(true);
	}
	public static void main(String arg[])
	{
		new Simple_Game();
	}
}