class RunnableThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Call no.="+i);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			e.printStackTrace();
			}
		}
	}
}

class extra10
{
	public static void main(String []args)
	{
		RunnableThread m1=new RunnableThread();
		Thread t1=new Thread(m1);
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
