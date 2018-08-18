package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountWeightRequest extends ActionRequest {
	private String account;
	
	public AccountWeightRequest(String account) {
	  action = Action.ACCOUNT_WEIGHT;
	  this.account = account;
	}
}
