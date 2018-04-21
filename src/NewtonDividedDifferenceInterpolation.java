
public class NewtonDividedDifferenceInterpolation {
	private Points points;
	private int n, k, f;
	private double val, sum = 0,mult = 1;
	
	public NewtonDividedDifferenceInterpolation(Points points)
	{
		this.points = points;
		n = points.getNumberOfPoints();
	}
	
	public void getSolution()
	{
		for(int j = 0; j < n-1; j++)
		{
			for(int i = n-1; i > j; i--)
			{
				val = (points.getf(0, i)-points.getf(0, i-1))/(points.getX(i)-points.getX(i-j-1));
				points.setf(0, i, val);
			}
		}
		int i, j;
		for(i = n-1; i >= 0; i--)
		{
			mult = 1;
			for(j = 0; j < i; j++)
			{
				mult *= (points.getP()-points.getX(j));
			}
			mult *= points.getf(0, j);
			sum += mult;
		}

		System.out.printf("\n\nAnswer: f(%.2f) = %f ",points.getP(),sum);
	}
}