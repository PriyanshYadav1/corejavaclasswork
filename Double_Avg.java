import java.util.Scanner;
public class Double_Avg {
	public static void main() 
	{
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		a = sc.nextDouble();
		System.out.println("Enter second value");
		b = sc.nextDouble();
		if (sc.hasNextDouble())
		{
			System.out.println("Avg"+(a+b)/2);
		}
		else 
		{
			System.out.println("No are not double");
		}
	}
}
