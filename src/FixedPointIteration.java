
public class FixedPointIteration {
	
	private double x0;
	private double es;
	private double imax;
	private double ea = 103897203;
	private double ans;
	Function2 f2 ;
	
	public FixedPointIteration(double x0,double es,int imax,Function2 f,double ans)
	{
		this.x0 = x0;
		this.es = es;
		this.imax = imax;
		this.f2 = f;
		this.ans = ans;
	}
	
	public void  getRoot()
	{
		print("Iteration---------xi---------ea-----------et--");
		print("\n");
		
		print("    "+1 +" ");
		
		print("          ");
		printf(x0);		
		print("                   ");
		
		print("\n");

		
		for(int i=1; i<=imax;i++)
		{
			
			double tempxr = x0;
			x0 = f2.getValue(tempxr);
			
			
			
			

			
			print("    "+(i+1)+" ");
			
			if(i<9) 
			{
				print("          ");
			}
			else
			{
				print("         ");
			}
			
			printf(x0);
			
			
			
				ea = Math.abs((tempxr-x0)/x0);
				ea*=100;
				print("      ");
				printf(ea);

			
			if(ea<=es)
			{
				break;
			}
			
			print("\n");
			
			
			
			
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
