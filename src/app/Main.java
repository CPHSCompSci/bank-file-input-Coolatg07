package app;
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{
		example1();
	}
	
	public static void example1()
	{
		
		Scanner Input = new Scanner(System.in);
		Bank bank = new Bank("Bank of Ew");
		int ewbankAccountNo = bank.createAccount("Mr. Ewbank");
		int menu = 0;
		int AccNum;
		int amount;
		System.out.println("******************************");
		System.out.println("     W E L C O M E   T O      ");
		System.out.println("     B A N K   O F   E W      ");
		System.out.println("******************************");
		//System.out.println("1. C R E A T E   A C C O U N T");
		//System.out.println("2.   L O A D   A C C O U N T  ");
		
		do
		{
		System.out.println("1. Create");
		System.out.println("2. Check");
		System.out.println("3. Deposit");
		System.out.println("4. Withdraw");
		System.out.println("5. Transfer");
		System.out.println("6. Save");
		System.out.println("7. Close");
		System.out.println();
		menu = Input.nextInt();
		Input.nextLine();
		
		switch(menu)
		{
			case 0:
				
				break;
		
			case 1:
				System.out.println("Enter your first and last name");
				String name = Input.nextLine();
				bank.createAccount(name);
				System.out.println();
				
				break;
		
			case 2:
				System.out.println("Enter your Account#");
				AccNum = Input.nextInt();
				System.out.println(bank.checkBalance(AccNum));
				
				break;
				
			case 3:
				System.out.println("Deposit");
				System.out.println("Enter your Account#");
				AccNum = Input.nextInt();
				System.out.println("Enter amount to Deposit");
				amount = Input.nextInt();
				bank.deposit(AccNum, amount);
				break;
				
			case 4:
				System.out.println("Withdraw");
				System.out.println("Enter your Account#");
				AccNum = Input.nextInt();
				System.out.println("Enter amount to Withdraw");
				amount = Input.nextInt();
				bank.withdraw(AccNum, amount);
				break;
				
			case 5:
				System.out.println("Transfer");
				System.out.println("Enter your Account#");
				AccNum = Input.nextInt();
				System.out.println("Enter Account# to transfer");
				int AccNum2 = Input.nextInt();
				System.out.println("Enter amount to Transfer");
				amount = Input.nextInt();
				bank.withdraw(AccNum, amount);
				bank.deposit(AccNum2, amount);
				break;
				
			case 6:
				bank.saveAccounts();
				
				
				
				break;
			case 7:
				System.out.println("Enter account#");
				AccNum = Input.nextInt();
				bank.closeAccount(AccNum);
				break;
		}
		
		}while (menu <= 6);
		/** 
		Bank bank = new Bank("Bank of CPHS");
		int ewbankAccountNo = bank.createAccount("Mr. Ewbank");
		int howardAccountNo = bank.createAccount("Mr. Howard");
		
		bank.deposit(ewbankAccountNo, 25);
		bank.deposit(howardAccountNo, 75);

		bank.checkBalance(ewbankAccountNo);
		bank.checkBalance(howardAccountNo);
		
		bank.withdraw(ewbankAccountNo, 10);
		bank.closeAccount(howardAccountNo);
		
		bank.checkBalance(ewbankAccountNo);
		bank.checkBalance(howardAccountNo);
		*/
		
	}
}
