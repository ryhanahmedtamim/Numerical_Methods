
public class NaiveGausssElimination {
	
	private LinearSystem ls;
	private int numberOfEquations;
	private double[] answers = new double[100];
	
	public NaiveGausssElimination(LinearSystem ls)
	{
		this.ls = ls;
		numberOfEquations = ls.getNumberOfEquations();
	}
	
	public void getSolution() 
	{
		
		for(int k=0; k<numberOfEquations-1; k++)
		{
			for(int i=k+1; i<numberOfEquations; i++)
			{
				double factor = ls.getCoefficient(i, k)/ls.getCoefficient(k, k);
				for(int j=k+1; j<numberOfEquations; j++)
				{
					double value = ls.getCoefficient(i, j)- factor*ls.getCoefficient(k, j);
					ls.setCoefficient(i, j, value);
				}
				
				double rSideValue = ls.getRigthSide(i) - ls.getRigthSide(k)*factor;
				ls.setRigthSide(i, rSideValue);
				
			}
			
		}
		
		answers[numberOfEquations-1]  = ls.
				getRigthSide(numberOfEquations-1)/ls.
				getCoefficient(numberOfEquations-1, numberOfEquations-1);
		
		for(int i=numberOfEquations-2; i>=0; i--)
		{
			double sum = ls.getRigthSide(i);
			//print(sum);
			for(int j=i+1; j<numberOfEquations; j++)
			{
				sum-=(ls.getCoefficient(i, j)*answers[j]);
			}
			answers[i] = sum/ls.getCoefficient(i, i);
		}
		
		print("The Roots are :\n");
		for(int i=0; i<numberOfEquations; i++)
		{
			print("X"+ (i+1) + " = ");
			printf(answers[i]);
			print("\n");
		}
		
		
	}
	
	
	
	//// this is for printing perpose
	public void print(Object o)
	{
		System.out.print(o);
	}
	
	public void printf(Object o)
	{
		System.out.printf("%.4f", o);
	}
}
