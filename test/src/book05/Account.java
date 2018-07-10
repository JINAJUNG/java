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

	public long deposit(long amount) { //����	
		return balance+=amount;
	}
	
	public long withdraw(long amount) { //����
		if(amount>balance) {
			return -1;
		}
		return balance-=amount;
	}
	
	public static void main(String[] args) {
		Account ac = new Account("����",5000);
		long out;
		ac.deposit(100000);
		out=10000;
		if(ac.withdraw(out)==-1) {
			System.out.println("��� ��� �� : "+out+"��");
			System.out.println("�ܾ��� ���� �մϴ�.");
			System.out.println("�ܾ� : "+ac.getBalance()+"��");
		}else {
			System.out.println("��� �� : "+out+"��");
			System.out.println("��� �� �ܾ� : "+ac.getBalance()+"��");
		}
	}
}
