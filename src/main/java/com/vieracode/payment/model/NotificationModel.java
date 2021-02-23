package com.vieracode.payment.model;

import java.io.Serializable;

public class NotificationModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int account;
	private String customer;
	private float amount;
	
	public NotificationModel() {
		super();
	}

	public NotificationModel(int account, String customer, float amount) {
		super();
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + account;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotificationModel other = (NotificationModel) obj;
		if (account != other.account)
			return false;
		return true;
	}	
}
