import java.util.Scanner;

public class Problem
{
	private int dataPoints;
	private double[] x;
	private double[] y;
	
	private static Scanner sc = new Scanner(System.in);
	
	public Problem(int dataPoints) 
	{
		this.dataPoints = dataPoints;
		x = new double[dataPoints];
		y = new double[dataPoints];
		
		setXandY();
	}
	
	void setXandY()
	{
		for(int i=0; i<dataPoints; i++)
		{
			print("Enter X"+(i+1) +": ");
			x[i] = sc.nextDouble();
			print("Enter Y"+(i+1) +": ");
			y[i] = sc.nextDouble();
		}
	}
	
	
	
	public int getDataPoints() 
	{
		return dataPoints;
	}
	
	public double getX(int pos) 
	{
		return x[pos];
	}
	public double[] getX() 
	{
		return x;
	}
	
	public double[] getY() 
	{
		return y;
	}
	
	public double getY(int pos) 
	{
		return y[pos];
	}
	
	
	
	public static void print(Object o)
	{
		System.out.print(o);
	}

}
