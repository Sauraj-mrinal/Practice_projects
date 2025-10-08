package com.pay.mrinal.bean;

import java.io.Serializable;

public class User implements Serializable  {
	
  public static final long serialVersionUID = 1L;
  // VARIABLE DECLEARE 
  private String userName,email,ifscCode,bankName,mobileNumber,accountNumber,history;
   private String  AccountPin;
   private double AccountBalance;
  
 
  //  // parameter constructor ------------------------------------------------------------------
  public User() {
	  super();
  }
  // parameter constructor 
  public User(String userName, String email, String ifscCode, String bankName, String mobileNumber, String accountNumber,
		String history, String accountPin, double accountBalance) {
	super();
	this.userName = userName;
	this.email = email;
	this.ifscCode = ifscCode;
	this.bankName = bankName;
	this.mobileNumber = mobileNumber;
	this.accountNumber = accountNumber;
	this.history = history;
	this.AccountPin = accountPin;
	this.AccountBalance = accountBalance;
}
  //----------------getter setter -----------------------------
  public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getAccountPin() {
		return AccountPin;
	}

	public void setAccountPin(String accountPin) {
		AccountPin = accountPin;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}

	  
 
  
}
