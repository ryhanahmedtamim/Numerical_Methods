
public class Function1 {
	
	double v;
	double m;
	
	public Function1(double m,double v)
	{
		this.v = v;
		this.m = m;
	}
	
	public double getValue(double c)
	{
		double e = Math.exp(-.146843*c);
		//System.out.println(9.8*m);
		double x = ((9.8*m)/c)*(1-e)-v;
		return x;
	}
}
