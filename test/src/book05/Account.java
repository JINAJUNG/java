package book05;

public class Account {

	private String owner;
	private long balance;

	public Account(String owner, long balance) {
		this.owner=owner;
		this.balance=balance;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long deposit(long amount) { //저축	
		return balance+=amount;
	}
	
	public long withdraw(long amount) { //인출
		if(amount>balance) {
			return -1;
		}
		return balance-=amount;
	}
	
	public static void main(String[] args) {
		Account ac = new Account("진아",5000);
		long out;
		ac.deposit(100000);
		out=10000;
		if(ac.withdraw(out)==-1) {
			System.out.println("희망 출금 액 : "+out+"원");
			System.out.println("잔액이 부족 합니다.");
			System.out.println("잔액 : "+ac.getBalance()+"원");
		}else {
			System.out.println("출금 액 : "+out+"원");
			System.out.println("출금 후 잔액 : "+ac.getBalance()+"원");
		}
	}
}
