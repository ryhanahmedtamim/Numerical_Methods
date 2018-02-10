
public class Main {

	public static void main(String[] args) {
		
		Function1 f = new Function1(68.1,40);
		BisectionMethod b = new BisectionMethod(12,16,9,.5,f,14.7802);
		b.getRoot();

	}

}
