package com.javano.request.accounts;

import com.javano.request.ActionRequest;
import com.javano.util.Action;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountMoveRequest extends ActionRequest {
	private String wallet;
	private String source;
	private String[] accounts;
	
	public AccountMoveRequest(String wallet, String source, String[] accounts) {
	  action = Action.ACCOUNT_MOVE;
	  this.wallet = wallet;
	  this.source = source;
	  this.accounts = accounts;
	}
}
