import java.util.Scanner;
public class LinearSystem {
	private double[][] coEfficient = new double[20][20];
	private double[] rightSide = new double[20];
	private int n;
	
	private static Scanner sc = new Scanner(System.in); 
	
	public LinearSystem(int n)
	{
		this.n = n;
		while(n>20 || n<=0)
		{
			if(n>20)
			{
				print("This Program build for maximum 20 linear Equations");
				n = sc.nextInt();
				continue;
				
			}
			
			print("Number of Equeation cannot be negative or Zero");
			n = sc.nextInt();
		}
		
		
		for(int i=0; i<n; i++) /// i is the equation number
		{
			for(int j=0; j<n; j++) // j coefficient number and right side
			{
				coEfficient[i][j] = sc.nextDouble();
			}
			rightSide[i] = sc.nextDouble();
		}
		
	}
	
	
	public double getRigthSide(int equationNo)
	{
		return rightSide[equationNo];
	}
	
	public void setRigthSide(int equationNo,double value)
	{
		 rightSide[equationNo] = value;
	}
	
	
	public double getCoefficient(int equationNo, int coEfficientNo)
	{
		
		return coEfficient[equationNo][coEfficientNo];
	}
	
	public void setCoefficient(int equationNo, int coEfficientNo,double value)
	{
		coEfficient[equationNo][coEfficientNo] = value;
	}
	
	
	
	
	public int getNumberOfEquations()
	{
		return n;
	}
	
	public void print(Object o)
	{
		System.out.print(o);
	}
	
}
