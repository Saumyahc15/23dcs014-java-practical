class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("user thread");
		}
	}
}

class extra2
{
	public static void main(String []args)
	{
		MyThread t1=new MyThread();
		t1.start();
		MyThread t2=new MyThread();
		t2.start();
		for(int i=0;i<4;i++)
		{
			System.out.println("main thread");
		}
	}
}
