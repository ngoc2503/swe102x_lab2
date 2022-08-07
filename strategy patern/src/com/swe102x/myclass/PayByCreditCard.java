package com.swe102x.myclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.swe102x.myinterface.PayStrategy;

public class PayByCreditCard implements PayStrategy{
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private CreditCard card;

	@Override
	public boolean pay(int paymentAmount) {
		if(cardIsPresent()) {
			System.out.println("paying " + paymentAmount + " using credit card");
			card.setAmount(card.getAmount() - paymentAmount);
			return true;
		}
		return false;
	}

	@Override
	public void collectPaymentDetail() {
		try {
			System.out.print("Enter the card number: ");
			String number = READER.readLine();
			System.out.print("Enter the card expiration date'mm/yy': ");
			String date = READER.readLine();
			System.out.print("Enter the CVV code: ");
			String cvv = READER.readLine();
			card = new CreditCard(number, date, cvv);
			// verify credit card....
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	private boolean cardIsPresent () {
		return card != null;
	}

}
