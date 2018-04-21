import java.util.Scanner;

public class Points
{
  private double[] x = new double[100];
  private double[][] y = new double[100][100];
  private int n;
  private double p;
  
  private static Scanner sc = new Scanner(System.in); 
  
  public Points(int n)
  {
    this.n = n;
    for(int i=0; i<n; i++)
    {
    	print("\n\nenter the value of x"+i+":");
    	x[i] = sc.nextDouble();
    	print("\n\nenter the value of f(x"+i+"): ");
    	y[0][i] = sc.nextDouble();
    	
    }
    print("\n\nEnter X for finding f(x): ");
    p = sc.nextDouble();
  }
  public double getP()
  {
	  return p;
  }
  public void setX(int pos,double val)
  {
	x[pos] = val;
  }
  public double getX(int pos)
  {
	return x[pos];
  }
  public void setf(int i,int j,double val)
  {
	y[i][j] = val;
  }
  public double getf(int i,int j)
  {
	return y[i][j];
  }
  public int getNumberOfPoints()
  {
	return n;
  }
  public static void print(Object o)
  {
	System.out.print(o);
  }
}