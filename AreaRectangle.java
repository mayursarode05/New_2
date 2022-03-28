package Self_evolution_lab1;
import java.util.Scanner;

public class AreaRectangle 
	{
	Scanner s=new Scanner(System.in);
		float a,b;
		float Area;
		float Height;
			void get()
			{
				System.out.println("Enter Width=");
				
				a=s.nextFloat();
				System.out.println("Enter Height=");
				b=s.nextFloat();
				Area=a*b;
				Height=2*(a+b);
				System.out.println("Area is " +a+"*"+b+"="+Area);
				System.out.println("Height is  "+"2"+" * "+"("+a+" + " +b+ ")"+" = "+Height);
			}
		
		
		public static void main(String[] args) 
		{
			AreaRectangle a=new AreaRectangle();
			a.get();
		}	
	}	
		
	



