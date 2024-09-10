class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("0-argument user thread");
		}
		run(100);
	}
	
	public void run(int a)
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("1-argument user thread");
		}
	}
}

class extra7
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
