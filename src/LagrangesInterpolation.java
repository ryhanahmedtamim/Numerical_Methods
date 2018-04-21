
public class LagrangesInterpolation {

	private Points points;
	private int n, k, f;
	private double res = 0.0;
	
	public LagrangesInterpolation(Points points)
	{
		this.points = points;
		n = points.getNumberOfPoints();
	}
	public void getSolution()
	{
		for(int i = 0; i < n; i++)
		{
			double temp = points.getf(0, i);
			for(int j = 0; j < n; j++)
			{
				if(j != i)
				{
					temp *= (points.getP()-points.getX(j))/(double)(points.getX(i)-points.getX(j));
				}
			}
			res += temp;
		}
		System.out.printf("\n\nAnswer: Value of %f is : %.5f\n",points.getP(), res);
	}
}