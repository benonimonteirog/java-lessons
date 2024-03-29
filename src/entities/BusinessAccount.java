package entities;

import exceptions.InsufficientFundsException;
import exceptions.WithdrawalLimitExceededException;

public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double initialDeposit, Double loanLimit) {
		super(number, holder, initialDeposit);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) throws WithdrawalLimitExceededException, InsufficientFundsException {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
