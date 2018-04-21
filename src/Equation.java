public class Equation
{
    public double f(double x)
    {
		double res = 0.2+25*x-200*x*x+675*x*x*x-900*x*x*x*x+400*x*x*x*x*x;
		///double res = 1/x;
    	///double res = 2000*Math.log((double)140000/(140000-2100*x))-9.8*x;
		return res;
    }
}