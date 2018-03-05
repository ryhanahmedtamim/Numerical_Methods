public class BisectionMethod {
	private double xl;
	private double xu;
	private double xr = 0;
	private int imax;
	private double es;
	double x = 14.7802;
	double ea = 93820948;
	//private ArrayList<Double> x = new ArrayList<Double>();
	Function1 f1;
	
	public BisectionMethod(double xl,double xu,int imax,double es, Function1 f,double x)
	{
		this.xl = xl;
		this.xu = xu;
		this.imax = imax;
		this.f1 = f;
		this.es = es;
		this.x = x;
	}
	
	public void  getRoot()
	{
		print("Iteration---------xl---------xu----------xr---------ea-----------et--");
		print("\n");

		
		for(int i=1; i<=imax;i++)
		{
			
			double tempxr = xr;
			xr = (xl+xu)/2;
			
			double et = Math.abs(x-xr)/x;
			
			et*=100;
			print("    "+i+" ");
			
			print("          ");
			printf(xl);
			print("     ");
			printf(xu);
			print("      ");
			printf(xr);
			
			if(i==1)
			{
			print("                   ");
			}
			else
			{
				ea = (Math.abs(tempxr-xr))/xr;
				ea*=100;
				print("      ");
				printf(ea);
				print("        ");
			}
			
			
			printf(et);
			
			if(ea<=es && i!=1)
			{
				break;
			}
			
			print("\n");
			
			double temp = f1.getValue(xl)*f1.getValue(xr);
			if(temp<0)
			{
				xu=xr;
			}
			else if(temp>0)
			{
				xl=xr;
			}
			else
			{
				ea = 0;
			}
			
		}
		
	}
	
	public void print(Object o)
	{
		System.out.print(o);
	}
	public void printf(Object o)
	{
		System.out.printf("%.3f", o);
	}	
	
	
}
