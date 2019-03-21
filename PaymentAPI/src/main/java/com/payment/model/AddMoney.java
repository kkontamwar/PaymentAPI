package com.payment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="AddMoney")
public class AddMoney implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="fromUser")
	public FromUser fromUser;
	@Column(name="toUser")
	public ToUser toUser;
	public FromUser getFromUser() {
		return fromUser;
	}
	public void setFromUser(FromUser fromUser) {
		this.fromUser = fromUser;
	}
	public ToUser getToUser() {
		return toUser;
	}
	public void setToUser(ToUser toUser) {
		this.toUser = toUser;
	}
	
	
}
