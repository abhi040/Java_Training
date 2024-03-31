package OOPsConcepts2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.money);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.Creditcard();
		hs.terminsurance();
		hs.mutualfund();
		
		USBank us=new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();

	}

}
