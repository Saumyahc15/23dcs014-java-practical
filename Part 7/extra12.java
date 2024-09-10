class RunnableThread implements Runnable
{
	
}

class extra12
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
