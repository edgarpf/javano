package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountInfoRequest extends ActionRequest {
    private String account;
	
	public  AccountInfoRequest(String account) {
	  action = Action.ACCOUNT_INFO;
	  this.account = account;
	}
}
