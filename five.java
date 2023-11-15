import java.util.Scanner;
abstract class RBI
{	
	static Scanner sc = new Scanner(System.in);
	double bal = 1000000;
	abstract double withdraw(double a);
	abstract double deposit(double a);
	abstract double balanceEnquiry( );
	abstract void loan();
	abstract void civil();
	abstract void tenure(int f);
	
}
class SBI extends RBI
{
	
	void selection()
	{
		System.out.println("**********THANKS FOR CHOOSING SBI*********");	
		System.out.println("1.withdraw \n2.deposit \n3.balanceEnquiry \n4.loan");
		int a = sc.nextInt();
		if(a==1)
		{	
			System.out.println("enter the amount : ");
			System.out.print(withdraw(sc.nextDouble()));
		}
		else if(a==2)
		{
			System.out.println("enter the amount : ");
			System.out.println(deposit(sc.nextDouble()));
		}
		else if(a==3)
		{
			//System.out.println("enter the amount : ");
			System.out.print(balanceEnquiry());
		}
		else if(a==4)
		{
			
			loan();
		}
		else
		{
			System.out.println("enter the valid input");
			selection();
		}
		System.out.println("do you want to do any transactons \n1.yes \n2.no");
		int g = sc.nextInt();
		if(g==1)
		{
		selection();
		}
		else 
		{
		System.out.println("thanks for choosing SBI AND HELPING THE GROWTH OF GOVT BANKS");
		}
	}
	 double withdraw(double a)
	{
		if(a>bal)	
		{
			System.out.println("insufficient funds please try with another amount");
			return bal;
		}
		else
		{
			System.out.println("your trasactionn is succesfull");
			return bal-a;
		}
	}
	 double deposit(double a)
	{
			System.out.println("the amount has deposited Succesfully");
			return bal+a;
	}
	double balanceEnquiry()
	{
			return bal;
	}
	void loan()
	{	
		System.out.println("is today is sunday or second saturday \n1.yes \n2.no");
			int y = sc.nextInt();
		if(y==1)
			{
			System.out.println("come tomorrow");
			}
		else
		{	
		System.out.println("what is the reason for your loan \n1.house \n2.car \n3.personal");
		int l = sc.nextInt();	
		if(l==1)
		{
			
			System.out.println("you selected home loan so to get the loan approved you have to submit any proof of your land \n1.yes \n2.no");
			int h=sc.nextInt();	
			if(h==1)
			civil();
			else
			loan();
		}
		if(l==2)
		{
			System.out.println("you selected car loan so to get the loan approved you have to submit any proof of your income \n1.yes \n2.no");
			int h=sc.nextInt();	
			if(h==1)
			civil();
			else
			loan();
		}
		if(l==3)
		{
			System.out.println("you selected personal loan so to get the loan approved you have to provide the reason for the loan \n1.yes \n2.no");
			int h=sc.nextInt();	
			if(h==1)
			civil();
			else
			loan();
		}
		}
	}		
	void civil()
		{
			System.out.print("enter your civil score");
			int c = sc.nextInt();
			if(c<=650&&c>=901)
			{
				System.out.println("you have entered the invalid score \n do you want to try again \n1.yes \n2.no");
				int y = sc.nextInt();
				if(y==1)
				civil();
			}
			else if(c>=651&&c<=700)
			{
				System.out.println("you have a average civil score and you are elgible for loan of 2 lakhs  your tenure and intrest will be");
				tenure(200000);
			}
			else if(c>=701&&c<=850)
			{
				System.out.println("you have a good civil score and you are elgible for loan of 5 lakhs  your tenure and intrest will be");
				tenure(500000);
			}
			else if(c>=851&&c<=900)
			{
				System.out.println("you have an excellent civil score and you are elgible for 7 lakhs  your tenure  and intrest will be");
				tenure(700000);	
			}
		}
		
		void tenure(int f)
		{
			System.out.println("you have three options to clear the loans \n1.one year \n2.two years \n3.three years");
			int t = sc.nextInt();
			if(t==1)
			{
				System.out.println("loan amount ="+f);
				double i = 0.15*700000;
				System.out.println("intrest rate  per month is "+i);
				double r = f+i;
				System.out.println("you have to pay this amount in twelve months per each month you have to pay "+ (r/12));
			}
			else if(t==2)
			{
				System.out.println("loan amount ="+f);
				double  i = 0.15*500000;
				System.out.println("intrest rate  per month is "+i);
				double r = i+f;
				System.out.println("you have to pay this amount in twelve months per each month you have to pay "+ (r/12));
			}
			else if(t==3)
			{
				System.out.println("loan amount ="+f);
				double i =0.15*700000;
				System.out.println("intrest rate  per year is "+i);
				double r = f+i;
				System.out.println("you have to pay this amount in twelve months per each month you have to pay "+ (r/12));
			}
			else
			{
				System.out.print("you have an invalid input do you want to try again \n1.yes \n2.no");
				int r = sc.nextInt();
				if(r==1)
				tenure(sc.nextInt());
			}
		}
}
class PAYTM extends RBI
{
	void selection()
	{	
		System.out.println("**********THANKS FOR CHOOSING PAYTM**********");
		System.out.println("1.withdraw \n2.deposit \n3.balanceEnquiry \n4.loan");
		int a = sc.nextInt();
		if(a==1)
		{	
			System.out.println("enter the amount : ");
			System.out.print(withdraw(sc.nextDouble()));
		}
		else if(a==2)
		{
			System.out.println("enter the amount : ");
			System.out.println(deposit(sc.nextDouble()));
		}
		else if(a==3)
		{
			//System.out.println("enter the amount : ");
			System.out.print(balanceEnquiry());
		}
		else if(a==4)
		{
			
			loan();
		}
		else
		{
			System.out.println("enter the valid input");
			selection();
		}
		System.out.println("do you want to do any transactons \n1.yes \n2.no");
		int g = sc.nextInt();
		if(g==1)
		{
		selection();
		}
		else 
		{
		System.out.println("thanks for choosing PAYTM THANKS FOR HELPING PRIVATE BAKS TO DEVELOP");
		}
	}
	 double withdraw(double a)
	{
		if(a>bal)	
		{
			System.out.println("insufficient funds please try with another amount");
			return bal;
		}
		else
		{
			System.out.println("your trasactionn is succesfull");
			return bal-a;
		}
	}
	 double deposit(double a)
	{
			System.out.println("the amount has deposited Succesfully");
			return bal+a;
	}
	double balanceEnquiry()
	{
			return bal;
	}
	void loan()
	{	
		
		System.out.println("what is the reason for your loan \n1.house \n2.car \n3.personal");
		int l = sc.nextInt();	
		if(l==1)
		{
			System.out.println("you selected home loan so to get the loan approved you have to submit any proof of your land \n1.yes \n2.no");
			int h=sc.nextInt();	
			if(h==1)
			civil();
			else
			loan();
		}
		if(l==2)
		{
			System.out.println("you selected car loan so to get the loan approved you have to submit any proof of your income \n1.yes \n2.no");
			int h=sc.nextInt();	
			if(h==1)
			civil();
			else
			loan();
		}
		if(l==3)
		{
			System.out.println("you selected personal loan so to get the loan approved you have to provide the reason for the loan \n1.yes \n2.no");
			int h=sc.nextInt();	
			if(h==1)
			civil();
			else
			loan();
		}
	}		
	void civil()
		{
			System.out.print("enter your civil score");
			int c = sc.nextInt();
			if(c<=650||c>=901)
			{
				System.out.println("you have entered the invalid score \n do you want to try again \n1.yes \n2.no");
				int y = sc.nextInt();
				if(y==1)
				civil();
			}
			else if(c>=651&&c<=700)
			{
				System.out.println("you have a average civil score and you are elgible for loan of 2 lakhs  your tenure and intrest will be");
				tenure(200000);
			}
			else if(c>=701&&c<=850)
			{
				System.out.println("you have a good civil score and you are elgible for loan of 5 lakhs  your tenure and intrest will be");
				tenure(500000);
			}
			else if(c>=851&&c<=900)
			{
				System.out.println("you have an excellent civil score and you are elgible for 7 lakhs  your tenure  and intrest will be");
				tenure(700000);	
			}
		}
		
		void tenure(int f)
		{
			System.out.println("you have three options to clear the loans \n1.one year \n2.two years \n3.three years");
			int t = sc.nextInt();
			if(t==1)
			{
				System.out.println("loan amount ="+f);
				double i = 0.15*700000;
				System.out.println("intrest rate  per month is "+i);
				double r = f+i;
				System.out.println("you have to pay this amount in twelve months per each month you have to pay "+ (r/12));
			}
			else if(t==2)
			{
				System.out.println("loan amount ="+f);
				double  i = 0.15*500000;
				System.out.println("intrest rate  per month is "+i);
				double r = i+f;
				System.out.println("you have to pay this amount in twelve months per each month you have to pay "+ (r/12));
			}
			else if(t==3)
			{
				System.out.println("loan amount ="+f);
				double i =0.15*700000;
				System.out.println("intrest rate  per year is "+i);
				double r = f+i;
				System.out.println("you have to pay this amount in twelve months per each month you have to pay "+ (r/12));
			}
			else
			{
				System.out.print("you have an invalid input do you want to try again \n1.yes \n2.no");
				int r = sc.nextInt();
				if(r==1)
				tenure(sc.nextInt());
			}
		}
}
class user
{	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
	System.out.println("Type the bank name with which you want do transaction \nSBI \nPAYTM");	
	System.out.println("NOTE: SBI is a governament bank and you will have server issues and we will not accept loans on SUNDAYS ");
	String s = sc.next();
	if(s.equals("SBI"))
	{
	SBI x = new SBI();
	x.selection();
	}
	else if(s.equals("PAYTM"))
	{
	PAYTM y = new PAYTM();
	y.selection();
	}
	else
	{
	main(null);
	}
	}
}
		
	