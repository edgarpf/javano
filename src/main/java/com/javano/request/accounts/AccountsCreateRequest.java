package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountsCreateRequest extends ActionRequest {
	private String wallet;
	private String count;
	private Boolean work;
	
	public AccountsCreateRequest(String wallet, String count) {
	  action = Action.ACCOUNTS_CREATE;
	  this.wallet = wallet;
	  this.count = count;
	}
	
	public AccountsCreateRequest(String wallet, String count, Boolean work) {
		  this(wallet, count);
		  this.work = work;
	}
}
