package prob03;

public class Money {

	private int amount;
	
	/**
	 * Constructor
	 */
	public Money(int amount) {
		this.amount = amount;
	}
	
	/**
	 * getter-setter
	 */
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
    
    /**
     * methods
     */
	public Money add(Money m) {
		return new Money(this.amount + m.getAmount());
	}
	
	public Money minus(Money m) {
		return new Money(this.amount - m.getAmount());
		
	}
	
	public Money multiply(Money m) {
		return new Money(this.amount * m.getAmount());
		
	}
	
	public Money devide(Money m) {
		return new Money(this.amount / m.getAmount());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Money && ((Money) obj).getAmount() == this.amount)
			return true;
		return false;
	}
}
