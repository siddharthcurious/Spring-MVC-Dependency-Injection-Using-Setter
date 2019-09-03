package com.springdemo.banking.models;

import com.springdemo.banking.Account;
import com.springdemo.banking.Card;

public class CurrentAccount implements Account {
	
	private Card creditCard;
	
	public CurrentAccount() {}
	
	public CurrentAccount(Card card) {
		this.creditCard = card;
	}
	
	@Override
	public String createAccount(){
		return "Current account has been created";
		
	}
	
	@Override
	public String getCardDetails() {
		return this.creditCard.getCardDetails();
	}
}
