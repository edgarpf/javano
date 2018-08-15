package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBalanceRequest extends ActionRequest {
	private String account;
	
	public AccountBalanceRequest(String account) {
	  action = Action.ACCOUNT_BALANCE;
	  this.account = account;
	}
}
