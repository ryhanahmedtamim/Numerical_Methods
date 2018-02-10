import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		print("For Roots of Equation : 1\n");
		print("For Differention : 2\n");
		print("For Integration : 3\n");
		
		
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
		else 
		{
			
		}
		
		
		
		

	}
	
	public static void print(Object o)
	{
		System.out.print(o);
	}

}
