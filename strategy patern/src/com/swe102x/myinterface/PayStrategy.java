package com.swe102x.myinterface;

public interface PayStrategy {
	boolean pay(int paymentAmount);
	void collectPaymentDetail();
}
