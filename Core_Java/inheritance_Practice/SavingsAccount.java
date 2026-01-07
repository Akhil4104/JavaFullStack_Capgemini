package inheritance_Practice;

public class SavingsAccount extends Account{
	int interestRate;
	SavingsAccount(int accountNo,int interestRate){
		super(accountNo);
		this.interestRate=interestRate;
	}
	
}
