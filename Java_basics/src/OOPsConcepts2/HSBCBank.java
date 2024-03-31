package OOPsConcepts2;

public class HSBCBank implements USBank, BrazilBank {
	
	public void credit() {
		System.out.println("USBank---credit");
	}
	
	public void debit() {
		System.out.println("USBank---debit");
	}
	
	public void transferMoney() {
		System.out.println("USBank---TransferMoney");
	}
	
	public void educationloan() {
		System.out.println("HSBC---educationloan");
	}
	
	public void Creditcard() {
		System.out.println("HSBC---CreditCard");
	}
	
	public void mutualfund() {
		System.out.println("Brazil---funds");
	}
	
	public void terminsurance() {
		System.out.println("Brazil---Term");
	}
	

}
