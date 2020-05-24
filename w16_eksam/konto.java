public class konto {

    private int balance;	

	
	public konto(int summaAlguses) {
		balance = summaAlguses;
	}
	
	public void deposit(int hulk) {
		balance = balance + hulk;
	}
	
	
	public int getBalance() {
        return balance;	
    }

       
}