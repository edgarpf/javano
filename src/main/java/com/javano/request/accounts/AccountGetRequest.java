package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountGetRequest extends ActionRequest {
	private String key;
	
	public AccountGetRequest(String key) {
	  action = Action.ACCOUNT_GET;
	  this.key = key;
	}
}
