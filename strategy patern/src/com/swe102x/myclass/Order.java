package com.swe102x.myclass;

import com.swe102x.myinterface.PayStrategy;

public class Order {
	private int totalCost;
	private boolean isClosed;
	
	public void proccessOrder(PayStrategy stratery) {
		stratery.collectPaymentDetail();
	}
	
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
	public int getTotalCost() {
		return totalCost;
	}
	
	public void setIsClosed() {
		this.isClosed = true;
	}
	
	public boolean getIsClosed() {
		return isClosed;
	}

}
