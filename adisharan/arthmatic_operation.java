class sum
{
	int a,b;
	void input(int x, int y)
	{
		a=x;
		b=y;
	}
	int sum1()
	{
		return(a+b);
	}
}
class sub
{
	int a,b;
	void input(int x, int y)
	{
		a=x;
		b=y;
	}
	int sub1()
	{
		return(a-b);
	}
}
class mul
{
	int a,b;
	void input(int x, int y)
	{
		a=x;
		b=y;
	}
	int mul1()
	{
		return(a*b);
	}
}
class div
{
	double a,b;
	void input (double x,double y)
	{
		a=x;
		b=y;
	}
	double div1()
	{
		return(a/b);
	}
}
class arthmatic_operation
{
	public static void main (String args [])
	{
		sum s =new sum ();
		sub u =new sub ();
		mul m= new mul();
		div d= new div();	
		s.input(10,20);
			System.out.println("sum="+s.sum1());
		u.input(30,3);
			System.out.println("sub="+u.sub1());
		m.input(13231343,166);
			System.out.println("mul="+m.mul1());
		d.input(2.5,3.5);
			System.out.println("div="+d.div1());
	}
}