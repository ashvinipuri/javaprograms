package abstractpack;

abstract class TestBankAccount{
	protected int id;
	 protected float balance;
	public TestBankAccount(int id, float balance) {
	super();
		this.id = id;
		this.balance = balance;
	}
	 
abstract public float calculateInterest();
	
}
	
class currentAccount extends TestBankAccount{
	
	public currentAccount(int id, float balance) {
		super(id, balance);
	}

	public float calculateInterest() {
		return (balance*0.07f);
	}

}
	
class LoanAccount extends TestBankAccount{
	
	public LoanAccount(int id, float balance) {
		super(id, balance);
	}

	public float calculateInterest() {
		return (balance*0.1f);
	}
}
	
class SavingAccount extends TestBankAccount{
	
	public SavingAccount(int id, float balance) {
		super(id, balance);
	}

	public float calculateInterest() {
		return (balance*0.56f);
	}
}
public class BankAccount {
 
	public static void main(String[] args) {
		currentAccount ca = new currentAccount(1,100000);
System.out.println(ca.calculateInterest());

LoanAccount la =new LoanAccount(1,5000);
System.out.println(la.calculateInterest());

SavingAccount sa =new SavingAccount(2, 4000);
System.out.println(sa.calculateInterest());
  
	}
}
