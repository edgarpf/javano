package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRepresentativeRequest extends ActionRequest {
	private String account;
	
	public AccountRepresentativeRequest(String account) {
	  action = Action.ACCOUNT_REPRESENTATIVE;
	  this.account = account;
	}
}
