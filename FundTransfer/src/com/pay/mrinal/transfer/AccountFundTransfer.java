package com.pay.mrinal.transfer;

import java.util.Scanner;

import com.pay.mrinal.bean.User;
import com.pay.mrinal.bean.utils.Utils;
import com.pay.mrinal.interaces_services.UserService;
import com.pay.mrinal.validation.ValidateUserDetails;

// yaha par ham jo interface vanaye hai wo implement krenge
public class AccountFundTransfer implements UserService {

	private String accType;
	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CreateAccount() {
		
		
		
		if(user1.getUserName()==null) {
			user=1;
		}else if(user2.getUserName() == null) {
			user=2;
		}
		// TODO Auto-generated method stub
		System.out.println("=====Fill Account Details=====");
		System.out.println("_______Enter Bank name________");
		String bankName = scn.next();
		if(!ValidateUserDetails.checkLength(3, bankName, false)) {
			System.out.println("Bnak name is Not valid ");
			this.CreateAccount();
		}else {
			user1.setBankName(bankName);
		}
		
		
		System.out.println("_______Enter Full name________");
		String name = scn.next();
		if(!ValidateUserDetails.checkLength(2, name, false)) {
			System.out.println(" name is not valiid ");
			this.CreateAccount();
		}else {
			user1.setUserName(name);
		}
		System.out.println("_______Enter Email________");
		String Email = scn.next();
		if(! ValidateUserDetails.validateEmail(Email)) {
			System.out.println(" Email is not valid  ");
			this.CreateAccount();
		}else {
			user1.setEmail(Email);
			
		}
		System.out.println("_______Mobile Number________");
		String mobNum = scn.next();
		if(!(ValidateUserDetails.validateMaxMobile(mobNum)&&ValidateUserDetails.validateMinMobile(mobNum) )) {
			System.out.println(" Enter valid Mobile Number !! ");
			this.CreateAccount();
		}else {
			user1.setMobileNumber(mobNum);
		}
		System.out.println("_______Enter IFSC code________");
		String ifscNo = scn.next();
		user1.setIfscCode(ifscNo);
		System.out.println("______Enter Account Type_______");
		System.out.println(" 1. Saving");
		System.out.println(" 2. Current");
		
		int accountType = scn.nextInt();
		if(accountType!=0 && accountType >2) {
			System.out.println("enter Valid choice ...");
		}else if(accountType!=0 && accountType<=2 ) {
			if(accountType==1) {
				accType = "Saving";
				
				
			}else {
				accType = "Current";
			}
		}
		
		
		System.out.println("_______Create 6 digit pin________");
		String  pin = scn.next();
		if(!ValidateUserDetails.checkLength(4, pin, false)) {
			System.out.println("Enter valid pin!!");
			this.CreateAccount();
		}else {
			user1.setAccountPin(pin);
		}
		
//		System.out.println(" ******Generating 11 Digit****** ");
		String acNum = Utils.generateAcNum();
		user1.setAccountNumber(acNum);
		//System.out.println("account Number is "+acNum);
		
		System.out.println(user1);
		
		this.createLog(user1, "Account Created");
		this.accountInfo(user1);
	}
	
	private void accountInfo(User user12) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createLog(User user, String msg) {
		String history = null;
		if(user.getHistory()==null) {
			history = "";
		}else {
			history = user.getHistory();
		}
		user.setHistory(msg + " on " +history);
	}
	
	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Account_Detail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Account_Activity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fund_Transfer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ChangePin() {
		// TODO Auto-generated method stub
		
	}
	//-----------------------------!!!!!!!!!!!!!---------------------------------------
	int user , activAcc;
	User user1, user2;
	{
		user1 = new User();
		user2 = new User();
	}
	Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// app jaise chale to hamare pass 2 option aana chahiye
		//1 login krega 
		//2 ya account create krega signup krega 
		
		AccountFundTransfer fundTransfer = new AccountFundTransfer();
		fundTransfer.mainMenu();
		
	}

	private void mainMenu() {
		// TODO Auto-generated method stub
		
	    System.out.println(" ");
	    
	    
	    if(activAcc!=0) {
	    	System.out.println("press 1 for logout !!!");
	    	System.out.println(" press 2 for Account Details..");
	    	System.out.println("press 3 to check Acount Activity..");
	    	System.out.println("press 4 for Fund Transfer");
	    	System.out.println(" press 5 for  withdraw ");
	    	System.out.println("press 6 for Change the pin");
	    }else {
	    	System.out.println("press 1 for LogIn....");
	    	System.out.println("press 2 for Create Account ");
	    }
	    System.out.println("-----------");
	    int menuChoice = scn.nextInt();
	    
	    if(menuChoice ==1) {
	    	this.login();
	    }else {
	    	this.CreateAccount();
	    }
        		
	}

}
