import java.util.Scanner;
class Account{
Scanner sc=new Scanner(System.in);
	String name;
	int accountNumber;
	double initialAmount;
	String address;
	String accountType;
	double balance;

public void Account1(String name, int accountNumber, double initialAmount){
	this.name=name;
	this.accountNumber=accountNumber;
	this.initialAmount=initialAmount;
}

public void Account2(String name, int accountNumber, String address, String accountType, double balance){

	
	this.name=name;
	this.accountNumber=accountNumber;
	this.address=address;
	this.accountType=accountType;
	this.balance=balance;
}

public void Deposit(double amount){
	if(amount>0){
		balance=balance+ amount;
		System.out.println("The amount deposited is:$" + amount);
	}
	else{
		System.out.println("Invalid deposition");
	}
}

public void Withdraw(double amount){
	if(amount>0 && amount<=balance){
		balance=balance-amount;
		System.out.println("The amount withdrawn is:$" + amount);
	}
	else{
		System.out.println("Insuffient balance");
	}
}

public double get_Balance(){
	return balance;
}

public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the details of first account");

	System.out.println("Enter the name of account holder");
	String name1=sc.nextLine();
	System.out.println("Enter the account number");
	int accountNumber1=sc.nextInt();
	System.out.println("Enter the initial amount");
	double initialAmount1=sc.nextDouble();

	Account Account1=new Account();

	System.out.println("Enter the details of second account");

	System.out.println("Enter the name of account holder");
	String name2=sc.nextLine();
	System.out.println("Enter the account number");
	int accountNumber2=sc.nextInt();
	System.out.println("Enter the address");
	String address2=sc.nextLine();
	System.out.println("Enter the type of account");
	String accountType2=sc.nextLine();
	System.out.println("Enter the balance amount");
	double balance2=sc.nextDouble();

	Account Account2=new Account();
	
	System.out.print("Enter the deposit amount for first account");
	double DepositAmount1=sc.nextDouble();
	Account1.Deposit(DepositAmount1);

	System.out.print("Enter the withdrawal amount for first account");
	double WithdrawAmount1=sc.nextDouble();
	Account1.Withdraw(WithdrawAmount1);

	
	System.out.print("Enter the deposit amount for second account");
	double DepositAmount2=sc.nextDouble();
	Account2.Deposit(DepositAmount2);

	System.out.print("Enter the withdrawal amount for second account");
	double WithdrawAmount2=sc.nextDouble();
	Account2.Withdraw(WithdrawAmount2);

	System.out.println("The balance of first aacount is:$" + Account1.get_Balance());
	System.out.println("The balance of second aacount is:$" + Account2.get_Balance());
	
	
}
}

	
	