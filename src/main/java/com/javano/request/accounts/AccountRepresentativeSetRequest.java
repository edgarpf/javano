package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRepresentativeSetRequest extends ActionRequest {
	private String wallet;
	private String account;
	private String representative;
	
	public AccountRepresentativeSetRequest(String wallet, String account, String representative) {
	  action = Action.ACCOUNT_REPRESENTATIVE_SET;
	  this.wallet = wallet;
	  this.account = account;
	  this.representative = representative;
	}
}
