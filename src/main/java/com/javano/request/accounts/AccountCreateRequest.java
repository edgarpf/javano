package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCreateRequest extends ActionRequest {
	private String wallet;
	
	public AccountCreateRequest(String wallet) {
	  action = Action.ACCOUNT_CREATE;
	  this.wallet = wallet;
	}
}
