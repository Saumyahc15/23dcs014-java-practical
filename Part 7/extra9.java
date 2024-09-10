class RunnableThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("user thread");
		}
	}
}

class extra9
{
	public static void main(String []args)
	{
		RunnableThread m1=new RunnableThread();
		Thread t1=new Thread(m1);
		t1.start();
		RunnableThread m2=new RunnableThread();
		Thread t2=new Thread(m2);
		t2.start();
		for(int i=0;i<4;i++)
		{
			System.out.println("main thread");
		}
	}
}
