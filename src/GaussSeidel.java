import java.util.Scanner;
public class GaussSeidel {

	private LinearSystem ls;
	private int numberOfEquations;
	private double es;
	private double[] answers = new double[100];
	private double[] answersold = new double[100];
	private static Scanner sc = new Scanner(System.in);
	
	
	public GaussSeidel(LinearSystem ls,double es)
	{
		this.ls = ls;
		numberOfEquations = ls.getNumberOfEquations();
		this.es = es;
	}
	
	public void getSolution(int imax)
	{
		for(int i=1; i<numberOfEquations;i++)
		{
			answers[i] = 0; // taking the initial guesses
		}
		
		/// start the procedure
		
		for(int i=0; i<numberOfEquations; i++)
		{
			double div = ls.getCoefficient(i, i);
			for(int j=0; j<numberOfEquations; j++)
			{
				double value = ls.getCoefficient(i, j);
				ls.setCoefficient(i, j, value/div);
			}
			double value = ls.getRigthSide(i);
			ls.setRigthSide(i, value/div);
		}
		
		print("Iteration\t\t");
		for(int i=0; i<numberOfEquations; i++)
		{
			print("X"+i+1+"\t\t");
		}
		for(int i=0; i<numberOfEquations; i++)
		{
			print("EA"+(i+1)+"\t\t");
			
		}
		
		print("\n");
		
		for(int itr=1; itr<=imax; itr++)
		{			
			for(int i=0; i<numberOfEquations; i++)
			{
				double sum = ls.getRigthSide(i);
				for(int j=0; j<numberOfEquations; j++)
				{
					if(i!=j)
					{
						sum-=(ls.getCoefficient(i,j)*answers[j]);
					}
				}
				answers[i] = sum;
				
			}
			print("\t"+itr + "\t\t");
			if(itr == 1)
			{
				for(int i=0; i<numberOfEquations; i++)
				{
					printf(answers[i]);
					answersold[i] = answers[i];
					print("\t\t");
				}
				print("\n");
			}
			else 
			{
				boolean flag = false;
				for(int i=0; i<numberOfEquations; i++)
				{
					printf(answers[i]);
					print("\t\t");
				}
				
				for(int i=0; i<numberOfEquations; i++)
				{
					double ea = (Math.abs(answers[i]-answersold[i]))/answers[i];
					ea*=100;
					
					printf(ea);
					print("\t\t");
					answersold[i] = answers[i];
					
					if(ea<es)
					{
						flag = true;
					}
					
				}
				print("\n");
				if(flag)
				{
					break;
				}
				
				
			}
			
			
			
		}
	}
	
	
	
	public void print(Object o)
	{
		System.out.print(o);
	}
	
	public void printf(Object o)
	{
		System.out.printf("%.4f", o);
	}
}
