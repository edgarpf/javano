package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidateAccountNumberRequest extends ActionRequest {
	private String account;
	
	public ValidateAccountNumberRequest(String account) {
	  action = Action.VALIDATE_ACOUNT_NUMBER;
	  this.account = account;
	}
}
