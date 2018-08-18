package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountInfoRequest extends ActionRequest {
    private String account;
	private Boolean representative;
	private Boolean weight;
	private Boolean pending;
    
	public AccountInfoRequest(String account) {
	  action = Action.ACCOUNT_INFO;
	  this.account = account;
	}
	
	public AccountInfoRequest(String account, Boolean representative, Boolean weight, Boolean pending) {
		  this(account);
		  this.representative = representative;
		  this.weight = weight;
		  this.pending = pending;
	}
}
