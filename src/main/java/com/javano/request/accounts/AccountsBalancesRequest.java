package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountsBalancesRequest extends ActionRequest {
	private String[] accounts;
	
	public AccountsBalancesRequest(String[] accounts) {
	  action = Action.ACCOUNTS_BALANCES;
	  this.accounts = accounts;
	}
}
