package com.swe102x.myclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.swe102x.myinterface.PayStrategy;

public class PayByPaypal implements PayStrategy{
	
	private static final Map<String, String> DATA_BASE = new HashMap<>();
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private String email;
	private String  password;
	private boolean signedIn;
	
	static {
		DATA_BASE.put("john", "john@gmail.com");
		DATA_BASE.put("anna", "annasmith@gmail.com");
	}

	@Override
	public boolean pay(int paymentAmount) {
		if (signedIn) {
			System.out.println("Paying " + paymentAmount + " using paypal.");
			return true;
		}
		return false;
	}

	@Override
	public void collectPaymentDetail() {
		try {
			while(!signedIn) {
				System.out.print("Enter the user's email: ");
				email = READER.readLine();
				System.out.print("Enter the password: ");
				password = READER.readLine();
				if(veryfy()) {
					System.out.println("Data veryfication has been successful");
				} else {
					System.out.println("Wrong email or password");
				}
			}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	private void setSignedIn(boolean signedIn) {
		this.signedIn = signedIn;
	}
	
	private boolean veryfy() {
		setSignedIn(email.equals(DATA_BASE.get(password)));
		return signedIn;
	}

}
