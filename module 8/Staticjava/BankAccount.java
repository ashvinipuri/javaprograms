package Staticjava;

public class BankAccount {
private int accNo;
private double balance;
private static int idnum=1;
 //int a=100;
 //int b=200;   //non static variables

public BankAccount()
{
	accNo=idnum++;
	balance=0;
}

public BankAccount(double balance)
{
	this.accNo=idnum++;
	this.balance=balance;
}

public static  int getIdnum()
{
	return idnum;
}

	@Override
public String toString() 
	{
	return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //System.out.println(getIdnum());     // 1 method
 //System.out.println(BankAccount.getIdnum());    // 2 method
 BankAccount bankAccount1=new BankAccount();
System.out.println(bankAccount1.getIdnum());
 
 BankAccount bankAccount2=new BankAccount();
 System.out.println(bankAccount2);
 
 BankAccount bankAccount3=new BankAccount(6000);
 System.out.println(bankAccount3);
	}

}
