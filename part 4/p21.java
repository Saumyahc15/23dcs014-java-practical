class Degree
{
void getDegree()
{
	System.out.println("I got a degree!!");
}
}

class Undergraduate extends Degree
{
	void getDegree()
    {
	System.out.println("I am an undergraduate!!");
	}
}

class Postgraduate extends Degree
{
	void getDegree()
    {
	System.out.println("I am a postgraduate!!");
	}
}

class p21
{
	public static void main(String []args)
	{
		Degree D=new Degree();
		Undergraduate U=new Undergraduate();
		Postgraduate P=new Postgraduate();
		
		D.getDegree();
		U.getDegree();
		P.getDegree();
	}
}
