package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountsFrontierRequest extends ActionRequest {
	private String[] accounts;
	
	public AccountsFrontierRequest(String[] accounts) {
	  action = Action.ACCOUNTS_FRONTIER;
	  this.accounts = accounts;
	}
}
