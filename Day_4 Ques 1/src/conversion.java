import java.util.Scanner;
public class conversion {
	public static void main (String [] args)
	{
		System.out.println("Enter an Integer value");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println( "Binary = "+Integer.toBinaryString(i)+"\n");
		System.out.println("Octal = "+Integer.toOctalString(i)+"\n");
		System.out.println("Hexadecimal = "+Integer.toHexString(i)+"\n");
	}

}
System.out.println("Menu \n1 Samosa Rs10\n2 Dal Soup Rs30\n3 Curry Rs45\n4 Idli Rs60 \n5 Poha Rs45\n6 Vada Rs10\n7 Dosa Rs80 \n8 Medu vada Rs\n9 Chai \n10 Coffee \n0 Exit.....");
int i=sc.nextInt();