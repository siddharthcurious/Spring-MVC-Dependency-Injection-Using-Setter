package com.springdemo.banking;

//import com.springdemo.banking.models.SavingAccount;
//import com.springdemo.banking.models.CurrentAccount;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankingApp {
	public static void main(String [] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account = context.getBean("myAccount", Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.getCardDetails());
		context.close();
	}
}
