package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountKeyRequest extends ActionRequest {
	private String account;
	
	public AccountKeyRequest(String account) {
	  action = Action.ACCOUNT_PUBLIC_KEY;
	  this.account = account;
	}
}