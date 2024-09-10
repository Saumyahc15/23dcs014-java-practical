class MyThread extends Thread
{
	
}

class extra5
{
	public static void main(String []args)
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<4;i++)
		{
			System.out.println("main thread");
		}
	}
}
