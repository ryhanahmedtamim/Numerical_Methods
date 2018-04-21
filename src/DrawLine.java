import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
public class DrawLine {
	private JFrame frame;
	private JPanel jPanel;
	Graphics graphics;
	
	public DrawLine(double a, double b,double[] x,double[] y,int n)
	{
		frame = new JFrame("Regression");
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jPanel = new JPanel();
		jPanel.setVisible(true);
		frame.add(jPanel);
		
		
		print(a,b,x,y,n);
		
	}
	
	public void print(double a, double b,double[] x,double[] y,int n)
	{
		
		
		 JPanel panel = new JPanel() {
	            @Override
	            public void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.setColor(Color.BLUE);
	                g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
	               // 
	                g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
	                
	                
	                g.setColor(Color.RED);
	                
	                int wd = this.getWidth();
	                int hi = this.getHeight();
	                
	                for(int i=0; i<n; i++)
	                {
	                	int x1 = (int)(x[i]*hi/25)+(wd/2);
	                	int y1 = (hi/2)-(int)(y[i]*hi/25);
	                	g.fillOval((int)x1,(int) y1,5, 5);
	                }
	                
	               
	                
	                
	                double x1 = -(wd/2)+10;
	                double x2 = (wd/2)-10;
	                double y1 = (a*x1 +b)+1;
	                double y2 = (a*x2 +b)+1;
	                 x1 = 10;
	                 x2 = wd-10;
	                 
	                 y1 = hi/2 - y1;
	                 y2 = hi/2 - y2;
	                g.setColor(Color.BLACK);
	                
	                int yy = (int)y1;
	                int yy2 = (int) y2;
	                int xx = (int) x1;
	                int xx2 = (int) x2;
	                
	                g.drawLine(xx,yy,xx2,yy2);
	                
	                //g.setColor(Color.yellow);
	                
	                //System.out.println(xx+ " "+yy);
	                
	               // g.fillOval(10,24,10, 10);
	                //g.fillOval(0,0,this.getWidth(), this.getHeight());
	                //g.fillOval(wd-10,10,10, 10);
	            }
	        };
	        frame.add(panel);
	        
	       
		
	}

}
