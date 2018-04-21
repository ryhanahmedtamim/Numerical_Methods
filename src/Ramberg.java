
public class Ramberg
{
   Trapizoidal tz = new Trapizoidal();
   private int  n = 1,iter = 0,maxitr;
   private double[][] arr = new double[20][20];
   public Ramberg(double a, double b, int maxit, double es)
   {

	   arr[1][1] = tz.TrapEq(n,a,b);
	  
	   //System.out.println(arr[1][1]);
	   
	   this.maxitr = maxit;
	   
	   
	   while(true)
	   {
		iter++;
		n = (int)Math.pow(2, iter);
		arr[iter+1][1] = tz.TrapEq(n,a,b);
		for(int k = 2; k <= iter+1; k++)
		{
		    int j = 2+iter-k;
		    arr[j][k] = (Math.pow(4, k-1)*arr[j+1][k-1]-arr[j][k-1])/(Math.pow(4, k-1)-1);
		}
		
		double ea = (Math.abs(arr[1][iter+1]-arr[2][iter])/arr[1][iter+1])*100;
		if(iter >= maxit)
	        	break;
				
	   }
	   
	   System.out.println("\n");
	   
	  /* for(int i=1; i<=maxitr; i++)
	   {
		   
		   for(int j=1; j<=maxitr; j++)
		   {
			   System.out.printf("%.6f",arr[i][j] );
			   System.out.print("\t");
		   }
		   
		   System.out.println("\n");
	   }*/
	   System.out.print("\n\nThe answer is : "+arr[1][iter+1]);
	   
   	  // System.out.printf("%f\n",arr[1][iter+1]);
   }
}