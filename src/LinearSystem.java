import java.util.Scanner;
public class LinearSystem {
	private double[][] coEfficient = new double[100][100];
	private double[] rightSide = new double[100];
	private int n;
	
	private static Scanner sc = new Scanner(System.in); 
	
	public LinearSystem(int n)
	{
		this.n = n;
		while(n>100 || n<=0)
		{
			if(n>100)
			{
				print("This Program build for maximum 100 linear Equations");
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
				print("Give the Coefficient of X ("+(j+1)+") : of equation No." + (i+1) +":");
				coEfficient[i][j] = sc.nextDouble();
			}
			print("Give the right side of   equation No."+(i+1)+ ":");
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
