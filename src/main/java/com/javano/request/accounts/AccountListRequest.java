package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountListRequest extends ActionRequest {
	private String wallet;
	
	public AccountListRequest(String wallet) {
	  action = Action.ACCOUNT_LIST;
	  this.wallet = wallet;
	}
}
