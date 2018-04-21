public class Trapizoidal
{ 
    Equation eq = new Equation();
    private double h,sum = 0,x;
    public double TrapEq(int n, double a, double b)
    {
    	h = (b-a)/n;
    	x = a;
    	sum = eq.f(x);
		for(int i = 1; i <= n-1; i++)
		{
		    x += h;
		    sum += (2*eq.f(x));
		}
		sum += eq.f(b);
		return ((b-a)*sum/(2*n));
    }  
}