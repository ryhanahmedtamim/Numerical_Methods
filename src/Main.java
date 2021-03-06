import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		print("For Roots of Equation : 1\n");
		print("For System of Linear Equations : 2\n");
		print("For Regression : 3\n");
		print("For NewtonDivided Differece : 4\n");
		print("For LagrangeInterpolating Polinomial : 5\n");
		print("For Integration : 6\n");
				
		Scanner sc = new Scanner(System.in);
		int x;
		x=sc.nextInt();
		
		if(x == 1)
		{
			
			print("For Brackting Method : 1\n");
			print("For Open Method : 2\n");
			
			int xx = sc.nextInt();
			
			if(xx == 1)
			{
				print("Enter the value of Mass :");
				double m = sc.nextDouble();
				print("Enter the value of Velocity :");
				double v = sc.nextDouble();
				Function1 f = new Function1(m,v);				
				print("Enter the value of lower guess xl :");
				double xl = sc.nextDouble();
				print("Enter the value of upper guess xu :");
				double xu = sc.nextDouble();
				print("Enter the value of Maxmum iteration :");
				int it = sc.nextInt();
				print("Enter the True value :");
				double tr = sc.nextDouble();
				print("Enter the value maximum error:");
				double es = sc.nextDouble();
				
				BisectionMethod b = new BisectionMethod(xl,xu,it,es,f,tr);
				b.getRoot();
			}
			else if(xx == 2)
			{
				print("Enter The value of x0 : ");
				double c = sc.nextDouble();
				Function2  f = new Function2();				
				print("Enter the value of Maxmum iteration :");
				int it = sc.nextInt();
				print("Enter the True value :");
				double tr = sc.nextDouble();
				print("Enter the value maximum error:");
				double es = sc.nextDouble();				
				FixedPointIteration fx = new FixedPointIteration(c,es,it,f,tr);
				fx.getRoot();	
			}
			else
			{
				print("Wrong selection\n");
			}
			
		}
		else if(x == 2)
		{
			
			print("Naive Gauss Elemination: 1\n");
			print("Gauss Seidel : 2\n");
			print("Gauss Jordan : 3\n");
			
			
			int xxx = sc.nextInt();
			
			while(xxx !=1 && xxx !=2 && xxx != 3)
			{
				print("Wrong Selections");
				print("\nPlease give the correct input\n");
				xxx = sc.nextInt();
			}
			
			if(xxx == 1) 
			{
				print("Give the number of equations: ");
			int n = sc.nextInt();
			LinearSystem ls = new LinearSystem(n);
			
			NaiveGausssElimination nvg = new NaiveGausssElimination(ls);
			
			nvg.getSolution();
			
			}
			else if(xxx==2)
			{
				print("Give the number of equations: ");
				int n = sc.nextInt();
				LinearSystem ls = new LinearSystem(n);
				print("Give the Maximum Error (%)");
				double es = sc.nextDouble();
				GaussSeidel gSeidel = new GaussSeidel(ls, es);
				print("Give the maximum Iterations");
				int imax = sc.nextInt();
				print("\n");
				gSeidel.getSolution(imax);
				
			}
			else 
			{
				print("Give the number of equations: ");
				int n = sc.nextInt();
				LinearSystem ls = new LinearSystem(n);
				
				GaussJordanElimination gaussJordanElimination = new GaussJordanElimination(ls);
				
				gaussJordanElimination.getSolution();
			}
		}
		else if(x == 3)
		{
			//new DrawLine();
			
			
			print("Enter The Number of Data Points :");
			int n = sc.nextInt();
			Problem problem = new Problem(n);
			
			Regression regression = new Regression(problem);
			
			regression.solve();		
			
		}
		else if(x==4) 
		{
			print("Give the number of points: ");
			  int n = sc.nextInt();
		      Points points = new Points(n);
		      NewtonDividedDifferenceInterpolation nddi = new NewtonDividedDifferenceInterpolation(points);
		      nddi.getSolution();
		}
		else if(x == 5)
		{
			print("Give the number of points: ");
	  	  	int n = sc.nextInt();
	        Points points = new Points(n);
	        LagrangesInterpolation li = new LagrangesInterpolation(points);
	        li.getSolution();
		}
		else if (x == 6) 
		{
			int iter;
			double a,b,es;
			print("Give the lower limit: ");
			a = sc.nextDouble();
			print("Give the upper limit: ");
			b = sc.nextDouble();
			print("Enter the maximum iteration :");
			iter = sc.nextInt();
			//print("Enter the maximum error (%) :");
			//es = sc.nextDouble();
			new Ramberg(a,b,iter,0);
		}
		

	}
	
	public static void print(Object o)
	{
		System.out.print(o);
	}

}
