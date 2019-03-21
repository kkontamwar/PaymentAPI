package com.payment.model;

import java.io.Serializable;

import javax.persistence.Column;

public class FromUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="accountNumber")
	private String accountNumber;
	@Column(name="amount")
	private Long amount;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
}
