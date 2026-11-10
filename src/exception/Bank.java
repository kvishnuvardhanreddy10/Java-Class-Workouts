package exception;

public class Bank {
	
	public void amount(int balance) {
		if(balance <= 0) {
			throw new MinimumBalance("Maintain balance more than 0rs");
		}
		else {
			System.out.println("Balance : " + balance);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		try {
		bank.amount(0);
		}catch(MinimumBalance e) {
			System.out.println(e.getMessage());
		}
	}

}
