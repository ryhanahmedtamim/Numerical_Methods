import java.util.Scanner;

public class GaussJordanElimination {

	private LinearSystem ls;
	private int numberOfEquations;
	private double[] answers = new double[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public GaussJordanElimination(LinearSystem ls)
	{
		this.ls = ls;
		this.numberOfEquations = ls.getNumberOfEquations();
	}
	
	public void getSolution() 
	{	
		
		
		
		for(int i = 0; i < numberOfEquations; i++)
		{
			for(int j = 0; j < numberOfEquations; j++)
			{
				if(i != j)
				{
					double c = ls.getCoefficient(j, i)/ls.getCoefficient(i, i);
					
					for(int k = 0; k < numberOfEquations; k++)
					{
						double dd = ls.getCoefficient(j,k)-ls.getCoefficient(i,k)*c;
						//print(c*ls.getCoefficient(i,k) +" \n");
						//String ccc = scanner.nextLine();
						ls.setCoefficient(j, k, dd);
					}
					double value = ls.getRigthSide(j)-c*ls.getRigthSide(i);
					
					ls.setRigthSide(j, value);
				}
			}
		}
		
		for(int i = 0; i < numberOfEquations; i++)
		{
			double div = ls.getCoefficient(i, i);
			for(int j = 0; j < numberOfEquations; j++)
			{
				
				if(i==j)
				{
					printf(ls.getCoefficient(i,j)/div + " \t\t");
				}
				else {
					print("0.0\t\t");
				}
				
			}
			print(ls.getRigthSide(i)/div +"\n");
		}
		
	}
	
////this is for printing perpose
	public void print(Object o)
	{
		System.out.print(o);
	}
	
	public void printf(Object o)
	{
		System.out.printf("%.4f", o);
	}
	
}
