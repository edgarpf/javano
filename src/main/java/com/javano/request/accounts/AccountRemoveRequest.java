package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRemoveRequest extends ActionRequest {
	private String wallet;
	private String account;
	
	public AccountRemoveRequest(String wallet, String account) {
	  action = Action.ACCOUNT_REMOVE;
	  this.wallet = wallet;
	  this.account = account;
	}
}
