
public class Regression {
	
	Problem pb;
	
	private double sumx;
	private double sumy;
	private double sumxx;
	private double sumxy;
	
	private double a;
	private double b;
	
	public Regression(Problem pb)
	{
		this.pb = pb;
		this.sumx = 0;
		this.sumy = 0;
		this.sumxx = 0;
		this.sumxy = 0;		
	}
	
	
	public void solve() 
	{
		for(int i=0; i<pb.getDataPoints(); i++)
		{
			sumx += pb.getX(i);
			sumy += pb.getY(i);
			sumxx += (Math.pow(pb.getX(i), 2));
			sumxy += (pb.getX(i)*pb.getY(i));
		}
		
		int n = pb.getDataPoints();
		
		a = (n*sumxy - sumx*sumy)/(n*sumxx - sumx*sumx);
		
		double yB = sumy/n;
		double xB = sumx/n;	
		b = yB-a*xB;
		
		System.out.println("a="+a+ " a0="+b );		
				
		new DrawLine(a,b,pb.getX(),pb.getY(),pb.getDataPoints());
		
		
	}
	
	
	
	
	
	

}
