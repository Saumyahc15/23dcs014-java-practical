class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Call no.="+i);
			try
			{
			sleep(1000);
			}
			catch(InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	}
}

class extra3
{
	public static void main(String []args)
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
