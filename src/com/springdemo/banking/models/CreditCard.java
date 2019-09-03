package com.springdemo.banking.models;

import com.springdemo.banking.Card;

public class CreditCard implements Card {

	@Override
	public String getCardDetails() {
		// TODO Auto-generated method stub
		return "This is CreditCard";
	}

}
