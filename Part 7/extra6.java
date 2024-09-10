class MyThread extends Thread
{
	public void start ()
	{
		for(int i=0;i<5;i++)
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

class extra6
{
	public static void main(String []args)
	{
		MyThread t1=new MyThread();
		t1.start();
		MyThread t2=new MyThread();
		t2.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
	}
}
