import java.util.Scanner;
public class doubleConvert {
	public static void main(String[]args) 
	{
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		if (sc.hasNextDouble())
		{
			a = sc.nextDouble();
			System.out.println("Enter second value");
			if (sc.hasNextDouble())
			{
				b = sc.nextDouble();
				System.out.println("Avg = "+(a+b)/2);
			}
			else 
			{
				System.out.println("Invalid input not a double value");
			}
		}
		else 
		{
			System.out.println("Invalid input not a double value");
		}
	}
}
