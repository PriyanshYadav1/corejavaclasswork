import java.util.Scanner;
public class Day4_que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=-1,amount=0,q=1;
		
		System.out.println("Select your Choice");
		while (i!=11)
		{
			System.out.println("Menu \n1 Samosa Rs10\n2 Dal Soup Rs30\n3 Curry Rs45\n4 Idli Rs60 \n5 Poha Rs45\n6 Vada Rs10\n7 Dosa Rs80 \n8 Medu vada Rs15\n9 Chai Rs 10\n10 Coffee Rs 15\n11 Exit.....");
			i=sc.nextInt();
			switch (i)
			{
			case 1:
			{
				System.out.println("You have selected Samosa now select quantity");
				q=1;
				q = sc.nextInt();
				q = q*10;
				amount += q;
				break;
			}
			case 2:
			{
				System.out.println("You have selected Dal Soup now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*30;
				amount += q;
				break;
			}
			case 3:
			{
				System.out.println("You have selected Curry now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*45;
				amount += q;
				break;
			}
			case 4:
			{
				System.out.println("You have selected Idli now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*60;
				amount += q;
				break;
			}
			case 5:
			{
				System.out.println("You have selected Poha now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*45;
				amount += q;
				break;
				
			}
			case 6:
			{
				System.out.println("You have selected Vada now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*10;
				amount += q;
				break;
			}
			case 7:
			{
				System.out.println("You have selected Dosa now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*80;
				amount += q;
				break;
			}
			case 8:
			{
				System.out.println("You have selected Medu Vada now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*15;
				amount += q;
				break;
			}
			case 9:
			{
				System.out.println("You have selected Tea now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*10;
				amount += q;
				break;
			}
			case 10:
			{
				System.out.println("You have selected Coffee now select quantity");
				q = 1;
				q = sc.nextInt();
				q = q*15;
				amount += q;
				break;
			}
			case 11:
			{
				break;
			}
			}
		}
		System.out.println("Your bill is = " + amount);
	}

}
