package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountsPendingRequest extends ActionRequest {
	private String[] accounts;
	private String count;
	
	public AccountsPendingRequest(String[] accounts, String count) {
	  action = Action.ACCOUNTS_PENDING;
	  this.accounts = accounts;
	  this.count = count;
	}
}
