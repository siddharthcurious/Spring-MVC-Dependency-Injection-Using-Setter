package com.springdemo.banking.models;

import com.springdemo.banking.Account;
import com.springdemo.banking.Card;

public class SavingAccount implements Account {
	
	private Card debitCard;
	
	public SavingAccount() {}
	
	public SavingAccount(Card card) {
		this.debitCard = card;
	}

	@Override
	public String createAccount(){
		return "Saving account has been created";
		
	}
	
	@Override
	public String getCardDetails() {
		return this.debitCard.getCardDetails();
	}
}
