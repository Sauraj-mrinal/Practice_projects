package com.pay.mrinal.interaces_services;

import com.pay.mrinal.bean.User;

public interface UserService {
	// these are interface
	public abstract void login();

	public abstract void CreateAccount();

	public abstract void Logout();

	public abstract void Account_Detail();

	public abstract void Account_Activity();

	public abstract void fund_Transfer();

	public abstract void withdraw();

	public abstract void ChangePin();

	void createLog(User user, String msg);

//	void createLog();
}
