import java.util.Scanner;
public class a {
	public static void main(String[] args) 
	{
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		a = sc.nextDouble();
		System.out.println("Enter second value");
		b = sc.nextDouble();
		System.out.println("Here");
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
